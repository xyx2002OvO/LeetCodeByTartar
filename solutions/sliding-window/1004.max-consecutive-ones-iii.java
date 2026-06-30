/*
 * @lc app=leetcode.cn id=1004 lang=java
 *
 * [1004] 最大连续1的个数 III
 */

// @lc code=start
class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCnt = 0, left = 0, ans = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCnt++;
            }

            // 只按业务非法条件收缩：窗口内 0 的个数不能超过 k。
            // 不要加 left < right。全 0 且 k=0 时，必须允许 left 走到 right+1，形成空窗口。
            while (zeroCnt > k) {
                if (nums[left] == 0) zeroCnt--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
// @lc code=end
