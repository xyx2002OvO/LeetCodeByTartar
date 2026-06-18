/**
 * LeetCode 430. Flatten a Multilevel Doubly Linked List
 *
 * Review:
 * - 思路正确：遇到 child 时，先保存原 next，再把 child 扁平化后接到 cur 后面，最后把原 next 接到 child 链尾。
 * - 关键点做对了：接 child 时更新 prev，接回 oriNext 时也更新 prev，并且最后把 cur.child 置空。
 * - 这版是递归 flatten + getTail 找尾节点，逻辑直观。
 *
 * Complexity note:
 * - 由于每次接回原 next 前都调用 getTail，极端多层结构下可能重复扫尾，最坏可能接近 O(n^2)。
 * - 面试更稳的优化是让 DFS helper 返回扁平化后的尾节点，避免重复 getTail。
 */
class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node cur = head;
        Node oriNext = head;

        while (cur != null) {
            if (cur.child != null) {
                oriNext = cur.next;
                cur.next = flatten(cur.child);
                cur.next.prev = cur;

                if (oriNext != null) {
                    Node tail = getTail(cur.next);
                    tail.next = oriNext;
                    oriNext.prev = tail;
                }

                cur.child = null;
                cur = oriNext;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public Node getTail(Node head) {
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }
}
