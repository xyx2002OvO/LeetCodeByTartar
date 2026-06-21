/**
 * LeetCode 560. Subarray Sum Equals K
 *
 * Review:
 * - 这是前缀和 + 频次 Map 的经典题。
 * - prefix[i] 表示到当前位置的前缀和；如果存在历史前缀和 prefix - k，
 *   那么这段历史前缀之后到当前位置的子数组和就是 k。
 * - 当前代码先 put 当前前缀再统计答案，因此 k == 0 时会把每个位置的“空子数组”也算进去，
 *   所以后面用 `ans -= nums.length` 修正。
 * - 更推荐的面试写法是：先统计答案，再 put 当前前缀，这样不需要对 k == 0 特判。
 *
 * Key point:
 * - nums[i] 和 k 都可能为负数，所以不能用滑动窗口；必须用前缀和。
 */
class Solution {
    public int subarraySum(int[] nums, int k) {
        // nums[i] 和 k 都可以是负数，不能使用普通滑动窗口。
        Map<Integer, Integer> mp = new HashMap<>();
        int[] dummys = new int[nums.length + 1];
        dummys[0] = 0;
        mp.put(0, 1);
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            dummys[i + 1] = dummys[i] + nums[i];
            mp.put(dummys[i + 1], mp.getOrDefault(dummys[i + 1], 0) + 1);
            ans += mp.getOrDefault(dummys[i + 1] - k, 0);
        }

        if (k == 0) {
            ans -= nums.length;
        }
        return ans;
    }
}
