/*
 * @lc app=leetcode.cn id=41 lang=java
 *
 * [41] 缺失的第一个正数
 */

// @lc code=start
class Solution {
    public int firstMissingPositive(int[] nums) {
        // 思路：把值 x 放到下标 x-1 的位置上（1 <= x <= n）。
        // 最终第一个 nums[i] != i+1 的位置，其答案就是 i+1。
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // 这里用 while 是关键：当前位置换过来一个新值后，可能仍然不在正确位置，需要继续放。
            while (nums[i] > 0
                    && nums[i] <= n
                    && nums[i] != i + 1
                    && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end
