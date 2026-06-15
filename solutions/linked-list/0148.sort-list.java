/*
 * @lc app=leetcode.cn id=148 lang=java
 *
 * [148] 排序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    private ListNode mergeSort(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode first=dummy.next;
        ListNode second=slow.next;
        slow.next=null;
        first=mergeSort(first);
        second=mergeSort(second);
        return merge(first,second);
    }
    private ListNode merge(ListNode first,ListNode second){
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        while(first!=null&&second!=null){
            if(first.val<second.val){
                cur.next=first;
                first=first.next;
            }else{
                cur.next=second;
                second=second.next;
            }
            cur=cur.next;
        }
        cur.next=(first==null)?second:first;
        return dummy.next;
    }
}
// @lc code=end

