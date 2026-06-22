/**
 * LeetCode 1109. Corporate Flight Bookings
 *
 * Review:
 * - 思路正确：区间加法用差分数组，最后做一次前缀和还原每个航班座位数。
 * - `booking[0]` 和 `booking[1]` 是 1-based，需要转成数组下标。
 * - 原代码里的 `flag` 没有使用，删除后逻辑更干净。
 * - 右边界如果已经是 n，不再写 `diff[n]`，避免越界。
 *
 * 对区间 [first, last] 加 seats：
 * diff[first - 1] += seats
 * 如果 last < n，则 diff[last] -= seats
 */
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff = new int[n];

        for (int[] booking : bookings) {
            int first = booking[0];
            int last = booking[1];
            int seats = booking[2];

            diff[first - 1] += seats;
            if (last < n) {
                diff[last] -= seats;
            }
        }

        for (int i = 1; i < n; i++) {
            diff[i] += diff[i - 1];
        }
        return diff;
    }
}
