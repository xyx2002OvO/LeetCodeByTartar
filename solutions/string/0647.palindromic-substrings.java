/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        boolean[][] dp = new boolean[n][n];
        char[] chars = s.toCharArray();

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // 和 5 题同一个 DP 状态；区别是 647 不保存最长串，而是统计所有 true 状态。
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                if (chars[i] == chars[j]) {
                    if (j - i < 3 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                    }
                }
                if (dp[i][j]) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
// @lc code=end
