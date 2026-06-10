/**
 * LeetCode 92. Reverse Linked List II
 *
 * 局部反转推荐使用 dummy + 头插法。
 *
 * 不变量：
 * - pre 始终指向反转区间前一个节点；
 * - cur 始终是反转区间的尾节点，也就是原区间第一个节点；
 * - next 每轮被摘出来，插到 pre 后面。
 *
 * 例子：1 -> 2 -> 3 -> 4 -> 5, left = 2, right = 4
 * pre = 1, cur = 2
 * 第 1 次头插 3：1 -> 3 -> 2 -> 4 -> 5
 * 第 2 次头插 4：1 -> 4 -> 3 -> 2 -> 5
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        // dummy 统一处理 left = 1 的情况。
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // pre 走到反转区间的前一个节点。
        ListNode pre = dummy;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        // cur 是反转区间第一个节点。头插过程中 cur 不动，只不断把 cur.next 摘出来前插。
        ListNode cur = pre.next;
        for (int i = 0; i < right - left; i++) {
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }

        return dummy.next;
    }
}
