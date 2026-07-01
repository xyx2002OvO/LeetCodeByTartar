/*
 * @lc app=leetcode.cn id=567 lang=java
 *
 * [567] 字符串的排列
 */

// @lc code=start
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] window = new int[26];
        int[] target = new int[26];
        int len = s1.length();

        // 和 438 同一模板：固定窗口长度为 s1.length()，比较字符频次。
        for (int i = 0; i < len; i++) {
            target[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length() - len; i++) {
            if (Arrays.equals(window, target)) {
                return true;
            }
            window[s2.charAt(i) - 'a']--;
            window[s2.charAt(i + len) - 'a']++;
        }

        return Arrays.equals(window, target);
    }
}
// @lc code=end
