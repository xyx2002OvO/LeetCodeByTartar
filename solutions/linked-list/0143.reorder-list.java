/*
 * @lc app=leetcode.cn id=143 lang=java
 *
 * [143] 重排链表
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
//beginTime:2026-6-12 10:56
class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode mid=slow.next;
        slow.next=null;
        mid=reverse(mid);
        slow=dummy.next;
        while(mid!=null){
            ListNode next=mid.next;
            mid.next=slow.next;
            slow.next=mid;
            slow=slow.next.next;
            mid=next;
        }
    }
    private ListNode reverse(ListNode head){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=head.next;
        while(cur!=null){
            head.next=cur.next;
            cur.next=dummy.next;
            dummy.next=cur;
            cur=head.next;
        }
        return dummy.next;
    }
}
//endTime:2026-6-12 11:06
// @lc code=end

