/**
 * LeetCode 19. Remove Nth Node From End of List
 *
 * 思路：dummy + fast/slow。
 * 关键不是让 slow 停在倒数第 n 个节点，而是停在它的前驱节点，
 * 这样才能用 slow.next = slow.next.next 完成删除。
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // dummy 统一处理删除头节点的情况。
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // 先让 fast 领先 slow n 步。
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // 当 fast 到达最后一个节点时，slow 正好在待删除节点的前一个节点。
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
