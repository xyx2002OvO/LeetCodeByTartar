/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并 K 个升序链表
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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode node:lists){
            if(node !=null){
                queue.offer(node);
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        while(!queue.isEmpty()){
            ListNode now=queue.poll();
            cur.next=now;
            cur=cur.next;
            if(now.next!=null){
                queue.offer(now.next);
            }
        }
        return dummy.next;
    }
}
// @lc code=end

