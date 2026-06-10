/**
 * LeetCode 206. Reverse Linked List
 *
 * 反转链表的核心是不变量：
 * - prev 指向已经反转完成的链表头；
 * - cur 指向当前待处理节点；
 * - next 临时保存原链表后续，避免断链。
 *
 * 这里保留递归版作为主实现，因为递归能很好体现“先反转后半段，再把 head 接到尾部”的思路。
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverseRecursive(head);
    }

    /**
     * 递归含义：把以 head 为头的链表反转，并返回反转后的新头节点。
     */
    private ListNode reverseRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseRecursive(head.next);

        // head.next 是反转后链表的尾节点，把 head 接到它后面。
        head.next.next = head;

        // head 变成新的尾节点，必须断开原来的 next，避免形成环。
        head.next = null;
        return newHead;
    }

    /**
     * 迭代模板：链表反转最常用的面试写法。
     */
    private ListNode reverseIterative(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
