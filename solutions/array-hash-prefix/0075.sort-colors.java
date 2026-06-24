/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        // 三路划分模板：
        // [0..left-1] 都是 0， [left..i-1] 都是 1， [right+1..n-1] 都是 2
        // i 在中间扫描未处理区间。
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i <= right; i++) {
            // 这里用 while 是为了处理“和 right 交换后换回来的值仍需继续分类”的情况。
            while (i <= right && i >= left && nums[i] != 1) {
                if (nums[i] == 0) {
                    swap(nums, i, left);
                    left++;
                } else { // nums[i] == 2
                    swap(nums, i, right);
                    right--;
                }
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end
