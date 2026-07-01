/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start
class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int[] window = new int[128];
        String ans = "";
        int left = 0, valid = 0, minLen = Integer.MAX_VALUE;
        char[] chars = s.toCharArray();

        for (int right = 0; right < s.length(); right++) {
            char c = chars[right];
            window[c]++;

            // valid 表示有多少种必要字符已经达到 need 要求。
            if (need.containsKey(c) && window[c] == need.get(c)) {
                valid++;
            }

            // 当前窗口已经覆盖 t，开始尽可能收缩左边界，寻找最短答案。
            while (valid == need.size()) {
                if (right - left + 1 < minLen) {
                    ans = s.substring(left, right + 1);
                    minLen = right - left + 1;
                }

                char d = chars[left];
                window[d]--;
                if (need.containsKey(d) && window[d] < need.get(d)) {
                    valid--;
                }
                left++;
            }
        }
        return ans;
    }
}
// @lc code=end
