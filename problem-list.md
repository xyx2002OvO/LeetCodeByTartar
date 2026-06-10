# 90 天模块化 LeetCode 题单

起始日期：2026-06-09；节奏：每天 2 题；总计：90 天 / 180 题。

说明：`[R]` 表示 Hot 100 或高频基础题，建议当作复习题限时完成；`[R2]` 表示同题换一种思路或模板二刷。

## 阶段安排

| 阶段 | 天数 | 模块 | 目标 |
|---|---:|---|---|
| 1 | 1-8 | 数组 / 哈希 / 前缀和 / 双指针 | 恢复手感，统一“枚举 + 数据结构优化”思路 |
| 2 | 9-15 | 滑动窗口 / 字符串 | 掌握窗口收缩条件与字符串状态维护 |
| 3 | 16-21 | 链表 | 强化指针操作、哨兵、快慢指针和局部反转 |
| 4 | 22-28 | 栈 / 单调栈 / 队列 | 掌握最近更大/更小、候选维护与单调性 |
| 5 | 29-35 | 二分 | 从查找二分过渡到答案二分 |
| 6 | 36-45 | 二叉树 / BST / 树形 DP | 建立递归返回值设计能力 |
| 7 | 46-53 | 堆 / 区间 / 贪心 | 训练局部最优证明和候选集维护 |
| 8 | 54-61 | 回溯 | 掌握路径、选择列表、剪枝和去重 |
| 9 | 62-71 | 图 / 并查集 / 拓扑 / 最短路 | 把问题转化为连通性、依赖关系或路径问题 |
| 10 | 72-85 | 动态规划基础与进阶 | 建立状态定义、转移、初始化和压缩习惯 |
| 11 | 86-90 | Trie / 位运算 / 设计 / 综合 | 补齐高级数据结构与原地算法意识 |

## 每日题单

| Day | 日期 | 模块 | 题目 1 | 题目 2 | 训练重点 |
|---:|---|---|---|---|---|
| 1 | 2026-06-09 | 数组哈希：计数与索引映射 | 0001 Two Sum [R] | 0217 Contains Duplicate | 哈希表去重、补数模型 |
| 2 | 2026-06-10 | 数组哈希：分组与频次 | 0049 Group Anagrams [R] | 0347 Top K Frequent Elements [R] | 字符频次编码、桶/堆意识 |
| 3 | 2026-06-11 | 前缀和：一维计数 | 0560 Subarray Sum Equals K [R] | 0523 Continuous Subarray Sum | 前缀和 + 哈希表 |
| 4 | 2026-06-12 | 前缀和：二维与差分 | 0304 Range Sum Query 2D - Immutable | 1109 Corporate Flight Bookings | 二维前缀和、差分数组 |
| 5 | 2026-06-13 | 双指针：有序数组 | 0167 Two Sum II - Input Array Is Sorted | 0015 3Sum [R] | 相向双指针、去重 |
| 6 | 2026-06-14 | 双指针：原地维护 | 0026 Remove Duplicates from Sorted Array | 0283 Move Zeroes [R] | 慢指针维护有效区 |
| 7 | 2026-06-15 | 双指针：盛水与面积 | 0011 Container With Most Water [R] | 0042 Trapping Rain Water [R] | 移动策略、左右最值 |
| 8 | 2026-06-16 | 数组综合：排序与区间意识 | 0075 Sort Colors | 0189 Rotate Array | 三路划分、数组翻转 |
| 9 | 2026-06-17 | 滑动窗口：定长窗口 | 0643 Maximum Average Subarray I | 0438 Find All Anagrams in a String [R] | 定长窗口频次 |
| 10 | 2026-06-18 | 滑动窗口：最长无重复 | 0003 Longest Substring Without Repeating Characters [R] | 0904 Fruit Into Baskets | 窗口收缩条件 |
| 11 | 2026-06-19 | 滑动窗口：最小覆盖 | 0076 Minimum Window Substring [R] | 0567 Permutation in String | need/window 计数 |
| 12 | 2026-06-20 | 滑动窗口：替换与预算 | 0424 Longest Repeating Character Replacement | 1004 Max Consecutive Ones III | 窗口内代价 |
| 13 | 2026-06-21 | 字符串：中心与回文 | 0005 Longest Palindromic Substring [R] | 0647 Palindromic Substrings [R] | 中心扩展、枚举中心 |
| 14 | 2026-06-22 | 字符串：解析与栈 | 0394 Decode String [R] | 0227 Basic Calculator II | 状态机、表达式解析 |
| 15 | 2026-06-23 | 字符串：匹配基础 | 0028 Find the Index of the First Occurrence in a String | 0459 Repeated Substring Pattern | KMP/周期意识 |
| 16 | 2026-06-24 | 链表：基础指针 | 0206 Reverse Linked List [R] | 0021 Merge Two Sorted Lists [R] | 指针重连、哨兵节点 |
| 17 | 2026-06-25 | 链表：快慢指针 | 0141 Linked List Cycle [R] | 0142 Linked List Cycle II [R] | 环检测与入口 |
| 18 | 2026-06-26 | 链表：删除与倒数 | 0019 Remove Nth Node From End of List [R] | 0234 Palindrome Linked List | 快慢指针、反转后半 |
| 19 | 2026-06-27 | 链表：区间反转 | 0092 Reverse Linked List II | 0025 Reverse Nodes in k-Group [R] | 局部反转模板 |
| 20 | 2026-06-28 | 链表：复制与相交 | 0138 Copy List with Random Pointer [R] | 0160 Intersection of Two Linked Lists | 映射/穿插复制、双指针 |
| 21 | 2026-06-29 | 链表：综合设计 | 0146 LRU Cache [R] | 0707 Design Linked List | 哈希 + 双向链表 |
| 22 | 2026-06-30 | 栈：括号与最小栈 | 0020 Valid Parentheses [R] | 0155 Min Stack [R] | 辅助栈、不变量 |
| 23 | 2026-07-01 | 栈：路径与温度 | 0071 Simplify Path | 0739 Daily Temperatures [R] | 栈模拟、单调栈 |
| 24 | 2026-07-02 | 单调栈：矩形 | 0084 Largest Rectangle in Histogram [R] | 0085 Maximal Rectangle | 贡献边界、哨兵 |
| 25 | 2026-07-03 | 单调栈：下一个更大 | 0496 Next Greater Element I | 0503 Next Greater Element II | 循环数组单调栈 |
| 26 | 2026-07-04 | 队列：单调队列 | 0239 Sliding Window Maximum [R] | 0862 Shortest Subarray with Sum at Least K | 单调队列维护候选 |
| 27 | 2026-07-05 | 栈综合：雨水与碰撞 | 0042 Trapping Rain Water [R2] | 0735 Asteroid Collision | 栈视角建模 |
| 28 | 2026-07-06 | 队列/BFS预热 | 0225 Implement Stack using Queues | 0232 Implement Queue using Stacks | 数据结构模拟 |
| 29 | 2026-07-07 | 二分：边界查找 | 0704 Binary Search | 0034 Find First and Last Position of Element in Sorted Array [R] | 左右边界模板 |
| 30 | 2026-07-08 | 二分：旋转数组 | 0033 Search in Rotated Sorted Array [R] | 0153 Find Minimum in Rotated Sorted Array [R] | 有序半边判断 |
| 31 | 2026-07-09 | 二分：答案二分 | 0875 Koko Eating Bananas | 1011 Capacity To Ship Packages Within D Days | 可行性单调性 |
| 32 | 2026-07-10 | 二分：二维矩阵 | 0074 Search a 2D Matrix [R] | 0240 Search a 2D Matrix II | 坐标映射/阶梯搜索 |
| 33 | 2026-07-11 | 二分：峰值与局部性 | 0162 Find Peak Element | 0852 Peak Index in a Mountain Array | 局部趋势 |
| 34 | 2026-07-12 | 二分：分割最大值 | 0410 Split Array Largest Sum | 1482 Minimum Number of Days to Make m Bouquets | 答案空间设计 |
| 35 | 2026-07-13 | 二分：进阶计数 | 0378 Kth Smallest Element in a Sorted Matrix | 0719 Find K-th Smallest Pair Distance | 二分答案 + 计数 |
| 36 | 2026-07-14 | 二叉树：遍历基础 | 0094 Binary Tree Inorder Traversal | 0102 Binary Tree Level Order Traversal [R] | 递归/迭代/BFS |
| 37 | 2026-07-15 | 二叉树：深度与直径 | 0104 Maximum Depth of Binary Tree [R] | 0543 Diameter of Binary Tree [R] | 后序返回信息 |
| 38 | 2026-07-16 | 二叉树：路径和 | 0112 Path Sum | 0437 Path Sum III [R] | DFS、前缀和上树 |
| 39 | 2026-07-17 | 二叉树：结构判断 | 0100 Same Tree | 0101 Symmetric Tree [R] | 同步递归 |
| 40 | 2026-07-18 | 二叉树：构造 | 0105 Construct Binary Tree from Preorder and Inorder Traversal [R] | 0106 Construct Binary Tree from Inorder and Postorder Traversal | 递归分治、索引映射 |
| 41 | 2026-07-19 | 二叉树：最近公共祖先 | 0236 Lowest Common Ancestor of a Binary Tree [R] | 0235 Lowest Common Ancestor of a BST | 返回目标节点 |
| 42 | 2026-07-20 | BST：验证与搜索 | 0098 Validate Binary Search Tree [R] | 0230 Kth Smallest Element in a BST [R] | 中序性质 |
| 43 | 2026-07-21 | 树形DP：打家劫舍与摄像头 | 0337 House Robber III | 0968 Binary Tree Cameras | 状态定义 |
| 44 | 2026-07-22 | 树序列化与视图 | 0297 Serialize and Deserialize Binary Tree [R] | 0199 Binary Tree Right Side View [R] | 层序/先序编码 |
| 45 | 2026-07-23 | N叉树/字典树预热 | 0429 N-ary Tree Level Order Traversal | 0208 Implement Trie (Prefix Tree) [R] | 树结构抽象 |
| 46 | 2026-07-24 | 堆：Top K | 0215 Kth Largest Element in an Array [R] | 0703 Kth Largest Element in a Stream | 小根堆/快选 |
| 47 | 2026-07-25 | 堆：多路归并 | 0023 Merge k Sorted Lists [R] | 0373 Find K Pairs with Smallest Sums | 堆存候选 |
| 48 | 2026-07-26 | 堆：双堆 | 0295 Find Median from Data Stream [R] | 0480 Sliding Window Median | 双堆与延迟删除 |
| 49 | 2026-07-27 | 区间：合并与插入 | 0056 Merge Intervals [R] | 0057 Insert Interval | 排序后维护右端点 |
| 50 | 2026-07-28 | 区间：会议室 | 0252 Meeting Rooms | 0253 Meeting Rooms II | 扫描线/堆 |
| 51 | 2026-07-29 | 贪心：跳跃游戏 | 0055 Jump Game [R] | 0045 Jump Game II [R] | 覆盖范围 |
| 52 | 2026-07-30 | 贪心：划分与调度 | 0435 Non-overlapping Intervals | 0763 Partition Labels | 局部最优证明 |
| 53 | 2026-07-31 | 贪心：加油站与任务 | 0134 Gas Station | 0621 Task Scheduler | 差值累计、冷却计数 |
| 54 | 2026-08-01 | 回溯：子集 | 0078 Subsets [R] | 0090 Subsets II | 选择/不选择、去重 |
| 55 | 2026-08-02 | 回溯：组合 | 0077 Combinations | 0039 Combination Sum [R] | start 参数 |
| 56 | 2026-08-03 | 回溯：排列 | 0046 Permutations [R] | 0047 Permutations II | used 数组、层内去重 |
| 57 | 2026-08-04 | 回溯：切割 | 0131 Palindrome Partitioning [R] | 0093 Restore IP Addresses | 切割线模型 |
| 58 | 2026-08-05 | 回溯：棋盘 | 0051 N-Queens | 0052 N-Queens II | 约束剪枝 |
| 59 | 2026-08-06 | 回溯：单词搜索 | 0079 Word Search [R] | 0212 Word Search II | 网格 DFS + Trie |
| 60 | 2026-08-07 | 回溯：电话号码与括号 | 0017 Letter Combinations of a Phone Number [R] | 0022 Generate Parentheses [R] | 路径构造 |
| 61 | 2026-08-08 | 回溯：综合搜索 | 0698 Partition to K Equal Sum Subsets | 0473 Matchsticks to Square | 桶模型、剪枝 |
| 62 | 2026-08-09 | 图：岛屿DFS/BFS | 0200 Number of Islands [R] | 0695 Max Area of Island | 网格连通块 |
| 63 | 2026-08-10 | 图：多源BFS | 0994 Rotting Oranges [R] | 0286 Walls and Gates | 层序扩散 |
| 64 | 2026-08-11 | 图：矩阵距离 | 0542 01 Matrix | 1162 As Far from Land as Possible | 多源 BFS 建模 |
| 65 | 2026-08-12 | 图：拓扑排序 | 0207 Course Schedule [R] | 0210 Course Schedule II | 入度、环检测 |
| 66 | 2026-08-13 | 图：克隆与连通 | 0133 Clone Graph [R] | 0323 Number of Connected Components in an Undirected Graph | 图遍历、建图 |
| 67 | 2026-08-14 | 并查集：基础 | 0684 Redundant Connection | 0547 Number of Provinces | 连通性维护 |
| 68 | 2026-08-15 | 并查集：方程与岛屿 | 0399 Evaluate Division | 0305 Number of Islands II | 带权并查集/动态连通 |
| 69 | 2026-08-16 | 最短路：Dijkstra | 0743 Network Delay Time | 1514 Path with Maximum Probability | 优先队列最短路 |
| 70 | 2026-08-17 | 最短路：网格 | 1091 Shortest Path in Binary Matrix | 1631 Path With Minimum Effort | BFS/Dijkstra 对比 |
| 71 | 2026-08-18 | 图综合：拓扑+状态 | 0802 Find Eventual Safe States | 0841 Keys and Rooms | 反图拓扑/可达性 |
| 72 | 2026-08-19 | DP：爬楼与代价 | 0070 Climbing Stairs [R] | 0746 Min Cost Climbing Stairs | 状态转移入门 |
| 73 | 2026-08-20 | DP：打家劫舍 | 0198 House Robber [R] | 0213 House Robber II [R] | 线性/环形 DP |
| 74 | 2026-08-21 | DP：最大子数组 | 0053 Maximum Subarray [R] | 0152 Maximum Product Subarray [R] | 以 i 结尾状态 |
| 75 | 2026-08-22 | DP：股票系列 | 0121 Best Time to Buy and Sell Stock [R] | 0122 Best Time to Buy and Sell Stock II | 状态机/贪心 |
| 76 | 2026-08-23 | DP：股票进阶 | 0309 Best Time to Buy and Sell Stock with Cooldown | 0714 Best Time to Buy and Sell Stock with Transaction Fee | 状态机约束 |
| 77 | 2026-08-24 | DP：网格路径 | 0062 Unique Paths [R] | 0064 Minimum Path Sum [R] | 二维 DP 压缩 |
| 78 | 2026-08-25 | DP：障碍与三角形 | 0063 Unique Paths II | 0120 Triangle | 路径 DP 变体 |
| 79 | 2026-08-26 | DP：背包基础 | 0416 Partition Equal Subset Sum [R] | 0494 Target Sum [R] | 01 背包转化 |
| 80 | 2026-08-27 | DP：完全背包 | 0322 Coin Change [R] | 0518 Coin Change II | 最值 vs 计数 |
| 81 | 2026-08-28 | DP：字符串基础 | 0115 Distinct Subsequences | 0072 Edit Distance [R] | 二维字符串 DP |
| 82 | 2026-08-29 | DP：LIS | 0300 Longest Increasing Subsequence [R] | 0673 Number of Longest Increasing Subsequence | 序列 DP / 贪心二分 |
| 83 | 2026-08-30 | DP：LCS与交错 | 1143 Longest Common Subsequence | 0097 Interleaving String | 双序列 DP |
| 84 | 2026-08-31 | DP：回文 | 0516 Longest Palindromic Subsequence | 0132 Palindrome Partitioning II | 区间/预处理 |
| 85 | 2026-09-01 | DP：区间 | 0312 Burst Balloons | 1039 Minimum Score Triangulation of Polygon | 区间 DP |
| 86 | 2026-09-02 | Trie：前缀与通配 | 0211 Design Add and Search Words Data Structure | 0648 Replace Words | Trie 查询 |
| 87 | 2026-09-03 | Trie：异或 | 0421 Maximum XOR of Two Numbers in an Array | 1707 Maximum XOR With an Element From Array | 二进制 Trie + 离线 |
| 88 | 2026-09-04 | 位运算：基础 | 0136 Single Number [R] | 0191 Number of 1 Bits | 异或、lowbit |
| 89 | 2026-09-05 | 位运算：进阶 | 0260 Single Number III | 0201 Bitwise AND of Numbers Range | 位分组、公共前缀 |
| 90 | 2026-09-06 | 设计与综合 | 0380 Insert Delete GetRandom O(1) | 0041 First Missing Positive [R] | O(1) 设计、原地标记 |

## 使用建议

1. **先限时再复盘**：Easy 15 分钟、Medium 35 分钟、Hard 60 分钟；超时后先写出卡点，再看题解。
2. **每题必须写复杂度**：不要只追求 AC，要能解释为什么这样做。
3. **每周二刷 2-3 道卡题**：如果当天两题都顺利，额外用 20 分钟二刷本周最不熟的一题。
4. **复盘优先级**：题型识别 > 状态/不变量 > 边界条件 > 代码模板。
5. **三个月后验收**：随机抽 20 道 `[R]` 和 20 道非 `[R]`，要求 80% 能在规定时间内独立 AC。
