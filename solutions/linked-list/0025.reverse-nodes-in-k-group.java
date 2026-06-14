/**
 * LeetCode 25. Reverse Nodes in k-Group
 *
 * Review:
 * - 整体思路正确：每次先确认后面还有 k 个节点，再对这一组做头插反转。
 * - `pre` 表示上一组反转完成后的尾节点，也就是当前组的前驱。
 * - `tail` 用来探测当前组是否够 k 个节点。
 * - `newHead = pre.next` 是当前组反转前的第一个节点；反转后它会变成当前组尾节点。
 *
 * 今日调试点：
 * - 你提到漏了 `cur = newHead.next;` 导致调试了一会儿。
 * - 这行的作用是：每一组开始反转前，重新把 cur 定位到当前组第二个节点。
 * - 如果漏掉它，cur 会沿用上一轮的旧位置，头插过程的“待摘节点”就不对，容易断链或循环异常。
 *
 * Template insight:
 * - 这题和 92 的局部反转是同一类：固定区间前驱 pre，把区间内后续节点逐个头插到 pre 后面。
 * - 区别是 25 需要先用 tail 检查当前组是否够 k 个，不足 k 个保持原样。
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode tail = dummy;

        while (true) {
            // 先确认当前组是否有 k 个节点。不足 k 个时直接返回。
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null) {
                    return dummy.next;
                }
            }

            ListNode end = tail.next;
            ListNode newHead = pre.next;

            // 每一组都必须重新定位 cur 到当前组第二个节点。
            // 漏掉这一行会让 cur 沿用旧值，是本题调试时的关键坑点。
            ListNode cur = newHead.next;

            // 对 [newHead, end) 做头插反转。newHead 始终是当前组反转后的尾节点。
            while (newHead.next != end) {
                newHead.next = cur.next;
                cur.next = pre.next;
                pre.next = cur;
                cur = newHead.next;
            }

            if (newHead.next == null) {
                return dummy.next;
            }

            // 当前组反转后，newHead 成为当前组尾节点，也就是下一组的 pre/tail 起点。
            pre = newHead;
            tail = newHead;
        }
    }
}
