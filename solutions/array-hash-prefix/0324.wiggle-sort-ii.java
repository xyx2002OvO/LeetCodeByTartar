/*
 * @lc app=leetcode.cn id=324 lang=java
 *
 * [324] 摆动排序 II
 */

// @lc code=start
class Solution {
    int[] nums;
    int n;

    int qselect(int l, int r, int k) {
        if (l == r) return nums[l];
        int x = nums[(l + r) >> 1], i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (nums[i] < x);
            do j--; while (nums[j] > x);
            if (i < j) swap(i, j);
        }
        int cnt = j - l + 1;
        if (k <= cnt) return qselect(l, j, k);
        return qselect(j + 1, r, k - cnt);
    }

    void swap(int a, int b) {
        int c = nums[a];
        nums[a] = nums[b];
        nums[b] = c;
    }

    // 虚拟下标映射：把线性下标访问顺序映射到“奇数位优先”的访问顺序。
    int getIdx(int x) {
        return (2 * x + 1) % (n | 1);
    }

    public void wiggleSort(int[] _nums) {
        nums = _nums;
        n = nums.length;

        // 找中位数（第 (n+1)/2 小，k 使用 1-based）。
        int mid = qselect(0, n - 1, (n + 1) >> 1);

        // 在虚拟下标空间做三路划分：
        // [0..l-1] > mid, [l..loc-1] == mid, [loc..r] 未处理, [r+1..n-1] < mid
        int l = 0, r = n - 1, loc = 0;
        while (loc <= r) {
            int mapped = getIdx(loc);
            if (nums[mapped] > mid) {
                swap(mapped, getIdx(l));
                l++;
                loc++;
            } else if (nums[mapped] < mid) {
                swap(mapped, getIdx(r));
                r--;
            } else {
                loc++;
            }
        }
    }
}
// @lc code=end
