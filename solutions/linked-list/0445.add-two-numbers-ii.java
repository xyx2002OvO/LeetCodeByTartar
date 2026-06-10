/**
 * LeetCode 445. Add Two Numbers II
 *
 * 链表中的数字是正序存储的：头节点是最高位，个位在链表尾部。
 * 加法天然需要从个位开始，所以这里先反转两个输入链表，
 * 转化成 LeetCode 2 的低位优先加法，最后再反转结果。
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;

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

            // 这里构造出来的是逆序结果，所以返回前还需要再反转一次。
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            carry = sum / 10;
        }

        return reverse(dummy.next);
    }

    /**
     * 头插法反转链表。
     *
     * dummy.next 始终表示反转后部分的头节点；
     * head 始终留在反转后部分的尾部；
     * 每轮把 head.next 摘下来，插到 dummy 后面。
     */
    private ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head.next;

        while (cur != null) {
            head.next = cur.next;   // 1. 从原链表中摘下 cur
            cur.next = dummy.next;  // 2. cur 指向当前反转部分的头
            dummy.next = cur;       // 3. cur 成为新的头
            cur = head.next;        // 4. 继续处理剩余未反转部分
        }

        return dummy.next;
    }
}
