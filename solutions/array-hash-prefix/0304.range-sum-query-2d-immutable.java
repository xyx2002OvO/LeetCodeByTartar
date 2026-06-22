/**
 * LeetCode 304. Range Sum Query 2D - Immutable
 *
 * Review:
 * - 思路正确：用二维前缀和把任意子矩阵查询降到 O(1)。
 * - `prefix` 使用 (m + 1) * (n + 1) 的哨兵行列，可以统一处理 row1 = 0 或 col1 = 0 的边界。
 * - 原代码的 `numMatrix` 命名容易和题目对象混淆，这里改成 `prefix`，语义更直接。
 * - LeetCode 本题保证 matrix 非空；如果工程里复用，需要额外处理空矩阵。
 *
 * 核心公式：
 * prefix[i + 1][j + 1] =
 *     prefix[i][j + 1] + prefix[i + 1][j] - prefix[i][j] + matrix[i][j]
 */
class NumMatrix {
    private final int[][] prefix;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        prefix = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prefix[i + 1][j + 1] = prefix[i][j + 1]
                        + prefix[i + 1][j]
                        - prefix[i][j]
                        + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        // 查询矩形 [row1..row2] x [col1..col2]。
        // 右下角要 +1 转成前缀坐标；左上角作为排除边界，不需要 +1。
        return prefix[row2 + 1][col2 + 1]
                - prefix[row1][col2 + 1]
                - prefix[row2 + 1][col1]
                + prefix[row1][col1];
    }
}
