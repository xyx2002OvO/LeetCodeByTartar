/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // 固定第一个数时去重：同一个 nums[i] 只作为起点处理一次。
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    ans.add(temp);

                    // 找到一组答案后，左右指针都需要跳过重复值，避免重复三元组。
                    while (left < right && nums[left] == temp.get(1)) left++;
                    while (left < right && nums[right] == temp.get(2)) right--;
                }
            }
        }
        return ans;
    }
}
// @lc code=end
