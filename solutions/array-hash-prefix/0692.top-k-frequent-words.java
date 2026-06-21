/**
 * LeetCode 692. Top K Frequent Words
 *
 * Review:
 * - 当前解法是 HashMap 统计词频 + 大根堆排序，思路正确。
 * - 比较规则：频次高的排前面；频次相同时，字典序小的排前面。
 * - 这里的 tie-break 很关键：如果频次相同但不比较字典序，结果顺序会不符合题意。
 *
 * Style note:
 * - `mp.get(b) != mp.get(a)` 会触发 Integer 拆箱，通常可用，但更推荐 `!mp.get(b).equals(mp.get(a))`
 *   或直接用 `int freqA = mp.get(a), freqB = mp.get(b)`。
 * - 减法比较器可以换成 Integer.compare，避免溢出并提升可读性。
 */
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> mp = new HashMap<>();
        PriorityQueue<String> queue = new PriorityQueue<>((a, b) -> {
            if (mp.get(b) != mp.get(a)) {
                return mp.get(b) - mp.get(a);
            } else {
                return a.compareTo(b);
            }
        });

        for (String str : words) {
            int freq = 0;
            if (mp.get(str) != null) {
                freq = mp.get(str);
            }
            mp.put(str, freq + 1);
        }

        for (String str : mp.keySet()) {
            queue.offer(str);
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(queue.poll());
        }
        return ans;
    }
}
