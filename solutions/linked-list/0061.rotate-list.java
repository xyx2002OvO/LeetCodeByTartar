/**
 * LeetCode 61. Rotate List
 *
 * Review:
 * - 思路正确：先求链表长度和原尾节点，再用 k % len 消除无效旋转。
 * - 当前写法没有真的先成环，而是先找到 newTail，再断链并把原尾接回 head，本质等价。
 * - `tailLen = len - (k % len)` 表示新尾节点在原链表中的位置（从 1 开始）。
 * - 如果 `tailLen == len`，说明 k 是 len 的倍数，旋转后不变。
 *
 * Style note:
 * - `jiaoShui` 实际表示原链表尾节点，建议后续命名为 `tail`，面试表达更直接。
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int len = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        // 统计长度，同时让 cur 最终停在原链表尾节点。
        while (cur.next != null) {
            len++;
            cur = cur.next;
        }

        // 原代码里的 jiaoShui 是原尾节点；它最后要接回原 head。
        ListNode jiaoShui = cur;
        cur = dummy;

        int tailLen = len - (k % len);
        if (tailLen == len) {
            return head;
        }

        // 从 dummy 出发走 tailLen 步，cur 到达旋转后的新尾节点。
        for (int i = 0; i < tailLen; i++) {
            cur = cur.next;
        }

        // cur.next 是新头；cur 断开成为新尾；原尾接到原 head 前面，完成旋转。
        dummy.next = cur.next;
        cur.next = null;
        jiaoShui.next = head;
        return dummy.next;
    }
}
