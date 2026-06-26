/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        // 左右双指针：面积由较短边决定。
        // 每次移动短板，因为移动长板只会让宽度变小，短板不变，面积不可能变大。
        int left = 0, right = height.length - 1, ans = 0;
        while (left < right) {
            ans = Math.max(ans, Math.min(height[left], height[right]) * (right - left));
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
// @lc code=end
