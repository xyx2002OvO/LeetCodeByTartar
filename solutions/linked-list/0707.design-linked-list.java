/**
 * LeetCode 707. Design Linked List
 *
 * Review:
 * - 使用 dummy head + dummy tail + size，整体是比较稳的双向链表设计。
 * - get/add/delete 的边界判断都正确：
 *   - get: index < 0 || index >= size 返回 -1
 *   - addAtIndex: index == size 合法，表示尾插；index > size 不插入
 *   - deleteAtIndex: index 必须在 [0, size)
 * - add/delete 都正确维护了 prev/next 和 size。
 *
 * Style note:
 * - 后续可以抽出 addAfter(prev, node) 和 remove(node) 两个私有方法，和 LRU 的双向链表操作统一起来。
 * - 当前每次都从 head 往后找节点，复杂度 O(n)；如果想优化常数，可以根据 index 与 size/2 判断从 head 还是 tail 开始找。
 */
class MyLinkedList {
    private static final int NOT_FOUND = -1;

    class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = new Node(0);
        this.tail = new Node(0);
        head.next = tail;
        tail.prev = head;
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return NOT_FOUND;
        }
        Node cur = head.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head.next;
        head.next.prev = newNode;
        head.next = newNode;
        newNode.prev = head;
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        newNode.prev = tail.prev;
        tail.prev.next = newNode;
        tail.prev = newNode;
        newNode.next = tail;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        Node newNode = new Node(val);
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        newNode.next = cur.next;
        cur.next.prev = newNode;
        cur.next = newNode;
        newNode.prev = cur;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        Node cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        cur.next.prev = cur.prev;
        cur.prev.next = cur.next;
        size--;
    }
}
