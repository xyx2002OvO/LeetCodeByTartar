/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
//beginTime:2026-6-12 10:50
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
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
            if(slow.val!=mid.val){
                return false;
            }
            slow=slow.next;
            mid=mid.next;
        }
        return true;
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
// @lc code=end

