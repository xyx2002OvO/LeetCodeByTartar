/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        // 单调栈解法：栈中维护一个高度单调不增的下标序列。
        // 当前柱子比栈顶高时，说明当前柱子可以作为右边界，弹出的栈顶是坑底。
        Deque<Integer> stack = new LinkedList<>();
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peekLast()] < height[i]) {
                int mid = stack.pollLast();
                if (stack.isEmpty()) break;

                int left = stack.peekLast();
                int h = Math.min(height[left], height[i]) - height[mid];
                int w = i - left - 1;
                ans += h * w;
            }
            // 每个下标都要入栈，作为后续坑底或左边界候选。
            stack.offerLast(i);
        }
        return ans;
    }
}
// @lc code=end
