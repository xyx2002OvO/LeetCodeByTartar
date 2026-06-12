/*
 * @lc app=leetcode.cn id=138 lang=java
 *
 * [138] 随机链表的复制
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/



class Solution {
    public Map<Node, Node> map = new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        if(map.containsKey(head)){
           return map.get(head);
        }
        map.put(head,new Node(head.val));
        Node copy=map.get(head);
        copy.next=copyRandomList(head.next);
        copy.random=copyRandomList(head.random);
        return copy;
    }
}
// @lc code=end

