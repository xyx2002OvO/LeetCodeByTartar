/*
 * @lc app=leetcode.cn id=904 lang=java
 *
 * [904] 水果成篮
 */

// @lc code=start
class Solution {
    public int totalFruit(int[] fruits) {
        // 904 是 159/340 的非会员替代题：最多保留 2 种元素的最长窗口。
        Map<Integer, Integer> count = new HashMap<>();
        int left = 0, ans = 0;

        for (int right = 0; right < fruits.length; right++) {
            count.put(fruits[right], count.getOrDefault(fruits[right], 0) + 1);

            // 业务非法条件是“种类数超过 2”，不要额外加 left < right。
            // 窗口允许被收缩到空，边界应该由业务条件自己决定。
            while (count.size() > 2) {
                int x = fruits[left];
                count.put(x, count.get(x) - 1);
                if (count.get(x) == 0) {
                    count.remove(x);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
// @lc code=end
