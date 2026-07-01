/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (p.length() > s.length()) {
            return ans;
        }

        int[] window = new int[26];
        int[] target = new int[26];
        int len = p.length();

        // 固定长度滑动窗口：先初始化长度为 len 的第一个窗口。
        for (int i = 0; i < len; i++) {
            target[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }

        // 每轮判断当前窗口，再右移一格：移出 s[i]，移入 s[i + len]。
        for (int i = 0; i < s.length() - len; i++) {
            if (Arrays.equals(window, target)) {
                ans.add(i);
            }
            window[s.charAt(i) - 'a']--;
            window[s.charAt(i + len) - 'a']++;
        }

        // 最后一个窗口不会在循环里被判断，需要单独补一次。
        if (Arrays.equals(window, target)) {
            ans.add(s.length() - len);
        }
        return ans;
    }
}
// @lc code=end
