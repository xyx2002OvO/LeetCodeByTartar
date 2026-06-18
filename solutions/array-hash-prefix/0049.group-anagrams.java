/**
 * LeetCode 49. Group Anagrams
 *
 * Review:
 * - 思路正确：异位词的字符频次相同，所以可以用 26 位计数数组生成 key。
 * - Java 里不能用 int[].toString() 表示数组内容；必须用 Arrays.toString(count)，否则得到的是对象地址风格字符串。
 * - 当前写法已经修正了 key 和变量作用域问题。
 *
 * Template:
 * - key = 字符频次签名
 * - value = 同一签名下的字符串列表
 *
 * Complexity:
 * - 设总字符数为 S，字符串个数为 n。
 * - 时间复杂度 O(S + 26n)，可视为 O(S)。
 * - 空间复杂度 O(S) 用于存储分组结果和哈希表。
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String now = strs[i];
            int[] use = new int[26];
            char[] chars = now.toCharArray();

            for (char c : chars) {
                use[c - 'a']++;
            }

            String key = Arrays.toString(use);
            List<String> strings;
            if (map.get(key) != null) {
                strings = map.get(key);
            } else {
                strings = new ArrayList<>();
            }

            strings.add(now);
            map.put(key, strings);
        }

        return new ArrayList<>(map.values());
    }
}
