/**
 * LeetCode 347. Top K Frequent Elements
 *
 * Review:
 * - 当前解法是 HashMap 统计频次 + 大根堆按频次取 TopK，思路正确。
 * - 你已经修正了一个关键点：PriorityQueue 不会随着外部 Map 的 value 改变自动重排，
 *   所以必须先完整统计频次，再把 key 放进堆。
 * - 当前大根堆会把所有不同元素都放入堆，复杂度是 O(n + m log m)，m 是不同元素个数。
 * - 如果想进一步优化，可以用大小为 k 的小根堆，复杂度 O(n + m log k)。
 *
 * Style note:
 * - 比较器 `mp.get(b) - mp.get(a)` 在极端情况下有溢出风险，面试建议写 Integer.compare。
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> (mp.get(b) - mp.get(a)));
        int[] ans = new int[k];
        

        for (int i = 0; i < nums.length; i++) {
            int freq = 0;
            if (mp.get(nums[i]) != null) {
                freq = mp.get(nums[i]);
            }
            mp.put(nums[i], freq + 1);
        }

        for (Integer num : mp.keySet()) {
            queue.offer(num);
        }

        for (int i = 0; i < k; i++) {
            ans[i] = queue.poll();
        }
        return ans;
    }
}
