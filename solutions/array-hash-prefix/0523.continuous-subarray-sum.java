/**
 * LeetCode 523. Continuous Subarray Sum
 *
 * Review:
 * - 核心是前缀和同余：如果两个前缀和对 k 取模相同，那么它们的差可以被 k 整除。
 * - Map 存 remainder -> earliest index，必须保留最早出现的位置，这样才能得到尽量长的子数组。
 * - 初始 `mp.put(0, -1)` 很关键，表示从数组开头开始的一段也可以被识别。
 * - 题目要求子数组长度至少为 2，因此判断 `i - index >= 2`。
 *
 * Style note:
 * - 当前写了 `k == 1` 的提前返回，在 nums.length > 1 时成立；但其实通用逻辑也能处理。
 * - 更稳的写法可以不保存整个 prefix 数组，只维护 running sum/remainder，避免前缀和过大。
 */
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length == 1) {
            return false;
        } else if (k == 1) {
            return true;
        }

        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        int[] dummys = new int[nums.length + 1];
        dummys[0] = 0;

        for (int i = 0; i < nums.length; i++) {
            dummys[i + 1] = dummys[i] + nums[i];
            int now = dummys[i + 1] % k;
            if (mp.containsKey(now)) {
                int index = mp.get(now);
                if (i - index >= 2) {
                    return true;
                }
            } else {
                mp.put(now, i);
            }
        }
        return false;
    }
}
