/**
 * LeetCode 92. Reverse Linked List II
 *
 * 思路：dummy + 头插法，配合 end 右边界做“半开区间”反转。
 * 反转 [start, end)：从 start 开始，把区间内后续节点逐个头插到 pre 后面，直到 cur == end 停止。
 *
 * 不变量：
 * - pre 始终指向反转区间前一个节点（固定不动）；
 * - start 是原区间第一个节点，反转过程中会下沉成区间尾部（固定不动）；
 * - cur 每轮从 start.next 取出、头插到 pre 后面；
 * - end 是反转区间右边界的“后一个节点”，在反转范围之外，固定不动，作为循环终止条件。
 *
 * 例子：1 -> 2 -> 3 -> 4 -> 5, left = 2, right = 4
 * pre = 1, start = 2, end = 5
 * 头插 3：1 -> 3 -> 2 -> 4 -> 5
 * 头插 4：1 -> 4 -> 3 -> 2 -> 5
 * cur 到达 5(end)，停止。
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        // dummy 统一处理 left = 1 的情况。
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // end 先走到反转区间右边界的后一个节点（位置 right + 1），它在反转范围之外，必须固定。
        ListNode pre = dummy;
        ListNode end = dummy;
        for (int i = 0; i < right - left + 2; i++) {
            end = end.next;
        }
        // pre、end 同步前移，把 pre 落到反转区间前一个节点（位置 left - 1），
        // end 同步推进到位置 right + 1 保持在区间外。
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
            end = end.next;
        }

        // start 是反转区间第一个节点，头插过程中 start 不动，只不断把 start.next 摘出来前插。
        ListNode start = pre.next;
        ListNode cur = start.next;
        while (cur != end) {
            start.next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            cur = start.next;
        }

        return dummy.next;
    }
}
