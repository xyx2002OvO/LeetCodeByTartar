/*
 * @lc app=leetcode.cn id=424 lang=java
 *
 * [424] 替换后的最长重复字符
 */

// @lc code=start
class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0, maxCnt = 0, ans = 0;

        for (int right = 0; right < s.length(); right++) {
            int idx = s.charAt(right) - 'A';
            count[idx]++;

            // maxCnt 维护历史最大频次，不在 left 收缩时回退。
            // 这是 424 的单调上界优化：固定窗口时保留最高频字符最优。
            maxCnt = Math.max(maxCnt, count[idx]);

            while (right - left + 1 - maxCnt > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
// @lc code=end
