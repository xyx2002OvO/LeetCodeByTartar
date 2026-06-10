/**
 * LeetCode 21. Merge Two Sorted Lists
 *
 * 你的 v2 思路已经正确：当一条链表为空后，直接把另一条剩余链表挂上去。
 * 这里整理成更标准的结构：主循环只处理两条链表都非空时的比较逻辑，
 * 循环结束后统一收尾。
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        // 主循环只负责公共逻辑：两条链表都还有节点时，选择较小节点接到结果链表后面。
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        // 其中一条链表为空后，剩余部分本身已经有序，直接整体挂接。
        cur.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }
}
