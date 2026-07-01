/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        char[] chars = s.toCharArray();
        String ans = "";

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // dp[i][j] 表示 s[i..j] 是否是回文串。
        // 按右端点 j 从小到大遍历，保证 dp[i+1][j-1] 已经被计算过。
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                if (chars[i] == chars[j]) {
                    // 长度小于 3 的区间，只要两端相等就是回文；否则看内部区间。
                    if (j - i < 3 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                    }
                }
                if (dp[i][j]) {
                    String temp = s.substring(i, j + 1);
                    if (temp.length() > ans.length()) {
                        ans = temp;
                    }
                }
            }
        }
        return ans;
    }
}
// @lc code=end
