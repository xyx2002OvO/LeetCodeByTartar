/**
 * LeetCode 2. Add Two Numbers
 *
 * 链表中的数字是逆序存储的：头节点就是个位。
 * 因此不需要反转链表，直接从 l1/l2 的头节点开始逐位相加即可。
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // dummy 用来统一处理结果链表的头节点，避免单独判断第一位。
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        // carry 表示进位。不要命名为 next，避免和链表节点的 next 指针混淆。
        int carry = 0;

        // 继续循环的条件有三个：
        // 1. l1 还有数字；2. l2 还有数字；3. 最后一位相加后还有进位。
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // 当前节点只保存个位，十位作为下一轮进位。
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            carry = sum / 10;
        }

        return dummy.next;
    }
}
