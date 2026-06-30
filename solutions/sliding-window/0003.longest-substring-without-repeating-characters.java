/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] exists = new boolean[256];
        char[] chars = s.toCharArray();
        int left = 0, ans = 0;

        for (int right = 0; right < chars.length; right++) {
            char c = chars[right];
            // 窗口不变量：窗口内不能有重复字符。
            // 推荐模板是 while (exists[c]) 持续收缩，直到当前字符可以安全加入。
            while (exists[c]) {
                exists[chars[left]] = false;
                left++;
            }
            exists[c] = true;
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
// @lc code=end
