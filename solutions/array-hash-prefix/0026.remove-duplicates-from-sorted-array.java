/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        // 有序数组去重：k 表示下一个可写入的位置。
        // [0..k-1] 始终保持已经处理过的不重复元素。
        if (nums.length == 1) return 1;

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            // 因为数组有序，只要和前一个原数组元素不同，就说明遇到了新值。
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
// @lc code=end
