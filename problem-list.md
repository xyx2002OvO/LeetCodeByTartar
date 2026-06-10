# 90 天模块化 LeetCode 题单（大厂面试强化版）

起始日期：2026-06-09；节奏：每天 2 题；总计：90 天 / 180 题。

本版根据前两天实际刷题情况重排：先完成链表模块，再进入数组、字符串、栈队列、二分、树、堆/贪心、回溯、图、DP、设计与综合。

标记说明：`[E]` Easy，`[M]` Medium，`[H]` Hard，`[Done]` 已完成，`[R2]` 二刷/换思路重做。

## 大厂面试标准

- 每题先独立思考，Medium 目标 30-40 分钟，Hard 目标 60-75 分钟。
- 每天至少总结一个“模型/不变量/状态定义”，不要只记录题解步骤。
- 代码提交前要求：变量命名清晰、核心逻辑有注释、能说明时间/空间复杂度。
- 每周末从本周题里抽 2 道二刷，要求不看题解完整写出。

## 阶段安排

| 阶段 | 天数 | 模块 | 大厂训练目标 |
|---|---:|---|---|
| 1 | 1-10 | 链表 | 从基础指针题推进到 k 组反转、多路归并、LRU/LFU 设计 |
| 2 | 11-18 | 数组 / 哈希 / 前缀和 / 双指针 | 强化原地算法、前缀计数、Hard 原地标记 |
| 3 | 19-26 | 滑动窗口 / 字符串 | 从窗口模板推进到 KMP、正则/通配 DP |
| 4 | 27-33 | 栈 / 单调栈 / 队列 | 掌握单调结构、表达式解析、双堆延迟删除 |
| 5 | 34-40 | 二分 | 从边界二分推进到答案二分、rank 计数 |
| 6 | 41-49 | 二叉树 / BST / Trie | 建立递归返回值、树形 DP、序列化与 Trie 搜索能力 |
| 7 | 50-56 | 堆 / 区间 / 贪心 | 候选集维护、扫描线、反悔贪心 |
| 8 | 57-62 | 回溯 | 去重、剪枝、棋盘、Trie + DFS 组合 |
| 9 | 63-71 | 图 / 并查集 / 最短路 | 连通性、拓扑、Dijkstra、MST 与限制最短路 |
| 10 | 72-82 | 动态规划 | 背包、区间、状态压缩与 Hard DP |
| 11 | 83-90 | 设计 / 位运算 / 综合 | Hard 设计、Trie、线段树/BIT、扫描线、复杂模拟 |

## 每日题单

| Day | 日期 | 模块 | 题目 1 | 题目 2 | 训练重点 |
|---:|---|---|---|---|---|
| 1 | 2026-06-09 | 链表：数字加法 | 0002 Add Two Numbers [M][Done] | 0445 Add Two Numbers II [M][Done] | 低位/高位存储判断，carry 模板，反转或栈 |
| 2 | 2026-06-10 | 链表：删除与合并 | 0019 Remove Nth Node From End of List [M][Done] | 0021 Merge Two Sorted Lists [E][Done] | dummy、fast/slow、主循环与收尾拆分 |
| 3 | 2026-06-11 | 链表：反转基础到区间 | 0206 Reverse Linked List [E] | 0092 Reverse Linked List II [M] | 反转模板、局部反转不变量 |
| 4 | 2026-06-12 | 链表：环检测 | 0141 Linked List Cycle [E] | 0142 Linked List Cycle II [M] | 快慢指针、数学相遇关系 |
| 5 | 2026-06-13 | 链表：相交与随机指针 | 0160 Intersection of Two Linked Lists [E] | 0138 Copy List with Random Pointer [M] | 双指针对齐、哈希/原地穿插复制 |
| 6 | 2026-06-14 | 链表：回文与重排 | 0234 Palindrome Linked List [E] | 0143 Reorder List [M] | 找中点、反转后半、链表交错合并 |
| 7 | 2026-06-15 | 链表：Hard 反转 | 0025 Reverse Nodes in k-Group [H] | 0061 Rotate List [M] | 分组边界、长度取模、尾首重连 |
| 8 | 2026-06-16 | 链表：多路归并 | 0023 Merge k Sorted Lists [H] | 0148 Sort List [M] | 堆/分治归并、链表归并排序 |
| 9 | 2026-06-17 | 链表：缓存设计 | 0146 LRU Cache [M] | 0460 LFU Cache [H] | 哈希 + 双向链表，频次桶设计 |
| 10 | 2026-06-18 | 链表：设计与多级链表 | 0707 Design Linked List [M] | 0430 Flatten a Multilevel Doubly Linked List [M] | API 边界、双向链表、DFS 展平 |
| 11 | 2026-06-19 | 数组哈希：索引与频次 | 0001 Two Sum [E] | 0049 Group Anagrams [M] | 哈希建模、key 设计 |
| 12 | 2026-06-20 | 数组哈希：TopK | 0347 Top K Frequent Elements [M] | 0692 Top K Frequent Words [M] | 桶/堆/排序取舍 |
| 13 | 2026-06-21 | 前缀和：子数组计数 | 0560 Subarray Sum Equals K [M] | 0523 Continuous Subarray Sum [M] | 前缀和 + 哈希表余数 |
| 14 | 2026-06-22 | 前缀和：二维与差分 | 0304 Range Sum Query 2D - Immutable [M] | 1109 Corporate Flight Bookings [M] | 二维前缀和、差分数组 |
| 15 | 2026-06-23 | 数组：原地标记 | 0041 First Missing Positive [H] | 0448 Find All Numbers Disappeared in an Array [E] | 下标作为哈希，原地 O(1) |
| 16 | 2026-06-24 | 数组：三路划分 | 0075 Sort Colors [M] | 0324 Wiggle Sort II [M] | 荷兰国旗、快选 + 交错映射 |
| 17 | 2026-06-25 | 双指针：去重与三数 | 0026 Remove Duplicates from Sorted Array [E] | 0015 3Sum [M] | 相向指针、去重边界 |
| 18 | 2026-06-26 | 双指针：容器与雨水 | 0011 Container With Most Water [M] | 0042 Trapping Rain Water [H] | 移动策略、左右最大值/单调栈 |
| 19 | 2026-06-27 | 滑动窗口：无重复 | 0003 Longest Substring Without Repeating Characters [M] | 0340 Longest Substring with At Most K Distinct Characters [M] | 窗口内状态与收缩条件 |
| 20 | 2026-06-28 | 滑动窗口：字符频次 | 0438 Find All Anagrams in a String [M] | 0567 Permutation in String [M] | 定长窗口，频次差分 |
| 21 | 2026-06-29 | 滑动窗口：最小覆盖 | 0076 Minimum Window Substring [H] | 0076 Minimum Window Substring [R2][H] | need/window、有效字符计数，二刷提速 |
| 22 | 2026-06-30 | 滑动窗口：预算模型 | 0424 Longest Repeating Character Replacement [M] | 1004 Max Consecutive Ones III [M] | 窗口内代价、最大频次维护 |
| 23 | 2026-07-01 | 字符串：回文 | 0005 Longest Palindromic Substring [M] | 0647 Palindromic Substrings [M] | 中心扩展、DP 对比 |
| 24 | 2026-07-02 | 字符串：栈解析 | 0394 Decode String [M] | 0227 Basic Calculator II [M] | 嵌套结构、表达式状态机 |
| 25 | 2026-07-03 | 字符串：匹配算法 | 0028 Find the Index of the First Occurrence in a String [E] | 0214 Shortest Palindrome [H] | KMP next 数组与前后缀 |
| 26 | 2026-07-04 | 字符串：Hard 匹配 | 0010 Regular Expression Matching [H] | 0044 Wildcard Matching [H] | 二维 DP 匹配状态 |
| 27 | 2026-07-05 | 栈：基础设计 | 0020 Valid Parentheses [E] | 0155 Min Stack [M] | 辅助栈、不变量 |
| 28 | 2026-07-06 | 单调栈：下一个更大 | 0739 Daily Temperatures [M] | 0503 Next Greater Element II [M] | 索引栈、循环数组 |
| 29 | 2026-07-07 | 单调栈：柱状图 | 0084 Largest Rectangle in Histogram [H] | 0085 Maximal Rectangle [H] | 左右边界、哨兵技巧 |
| 30 | 2026-07-08 | 单调队列：窗口最大值 | 0239 Sliding Window Maximum [H] | 0862 Shortest Subarray with Sum at Least K [H] | 单调队列维护候选 |
| 31 | 2026-07-09 | 栈：局部最优模拟 | 0735 Asteroid Collision [M] | 0402 Remove K Digits [M] | 栈维护局部最优 |
| 32 | 2026-07-10 | 栈：表达式进阶 | 0224 Basic Calculator [H] | 0772 Basic Calculator III [H] | 递归下降/栈处理括号 |
| 33 | 2026-07-11 | 栈队列：双堆 | 0295 Find Median from Data Stream [H] | 0480 Sliding Window Median [H] | 双堆、延迟删除 |
| 34 | 2026-07-12 | 二分：边界 | 0704 Binary Search [E] | 0034 Find First and Last Position of Element in Sorted Array [M] | 左右边界模板 |
| 35 | 2026-07-13 | 二分：旋转数组 | 0033 Search in Rotated Sorted Array [M] | 0154 Find Minimum in Rotated Sorted Array II [H] | 有序半边、重复元素退化 |
| 36 | 2026-07-14 | 二分：答案二分 | 0875 Koko Eating Bananas [M] | 1011 Capacity To Ship Packages Within D Days [M] | 可行性单调性 |
| 37 | 2026-07-15 | 二分：矩阵 | 0074 Search a 2D Matrix [M] | 0240 Search a 2D Matrix II [M] | 坐标映射、阶梯搜索 |
| 38 | 2026-07-16 | 二分：分割最大值 | 0410 Split Array Largest Sum [H] | 0719 Find K-th Smallest Pair Distance [H] | 答案二分 + 计数 |
| 39 | 2026-07-17 | 二分：有序矩阵计数 | 0378 Kth Smallest Element in a Sorted Matrix [M] | 0668 Kth Smallest Number in Multiplication Table [H] | 二分答案 + rank |
| 40 | 2026-07-18 | 二分：贪心检查 | 1482 Minimum Number of Days to Make m Bouquets [M] | 1552 Magnetic Force Between Two Balls [M] | 检查函数设计 |
| 41 | 2026-07-19 | 二叉树：遍历 | 0094 Binary Tree Inorder Traversal [E] | 0102 Binary Tree Level Order Traversal [M] | 递归/迭代/BFS |
| 42 | 2026-07-20 | 二叉树：后序信息 | 0104 Maximum Depth of Binary Tree [E] | 0543 Diameter of Binary Tree [E] | 后序返回子树信息 |
| 43 | 2026-07-21 | 二叉树：路径和 | 0112 Path Sum [E] | 0437 Path Sum III [M] | DFS、树上前缀和 |
| 44 | 2026-07-22 | 二叉树：构造 | 0105 Construct Binary Tree from Preorder and Inorder Traversal [M] | 0106 Construct Binary Tree from Inorder and Postorder Traversal [M] | 递归区间、索引映射 |
| 45 | 2026-07-23 | 二叉树：LCA | 0236 Lowest Common Ancestor of a Binary Tree [M] | 1644 Lowest Common Ancestor of a Binary Tree II [M] | 返回值语义、节点存在性 |
| 46 | 2026-07-24 | BST：性质 | 0098 Validate Binary Search Tree [M] | 0230 Kth Smallest Element in a BST [M] | 中序有序、边界传递 |
| 47 | 2026-07-25 | 树形 DP | 0337 House Robber III [M] | 0968 Binary Tree Cameras [H] | 状态定义、覆盖关系 |
| 48 | 2026-07-26 | 序列化 | 0297 Serialize and Deserialize Binary Tree [H] | 0449 Serialize and Deserialize BST [M] | 结构编码、反序列化边界 |
| 49 | 2026-07-27 | Trie 基础 | 0208 Implement Trie (Prefix Tree) [M] | 0211 Design Add and Search Words Data Structure [M] | 前缀树、通配搜索 |
| 50 | 2026-07-28 | 堆：TopK/快选 | 0215 Kth Largest Element in an Array [M] | 0347 Top K Frequent Elements [R2][M] | 堆与快选对比 |
| 51 | 2026-07-29 | 堆：多路归并 | 0023 Merge k Sorted Lists [R2][H] | 0373 Find K Pairs with Smallest Sums [M] | 候选集最小堆 |
| 52 | 2026-07-30 | 区间：合并 | 0056 Merge Intervals [M] | 0057 Insert Interval [M] | 排序后维护右端点 |
| 53 | 2026-07-31 | 区间：会议室 | 0253 Meeting Rooms II [M] | 0732 My Calendar III [H] | 扫描线、差分 TreeMap |
| 54 | 2026-08-01 | 贪心：跳跃 | 0055 Jump Game [M] | 0045 Jump Game II [M] | 覆盖范围 |
| 55 | 2026-08-02 | 贪心：区间调度 | 0435 Non-overlapping Intervals [M] | 0452 Minimum Number of Arrows to Burst Balloons [M] | 按右端点排序 |
| 56 | 2026-08-03 | 贪心：Hard | 0135 Candy [H] | 0871 Minimum Number of Refueling Stops [H] | 双向扫描、反悔堆 |
| 57 | 2026-08-04 | 回溯：子集组合 | 0078 Subsets [M] | 0090 Subsets II [M] | 选择树、去重 |
| 58 | 2026-08-05 | 回溯：组合求和 | 0039 Combination Sum [M] | 0040 Combination Sum II [M] | start、剪枝、去重 |
| 59 | 2026-08-06 | 回溯：排列 | 0046 Permutations [M] | 0047 Permutations II [M] | used、层内去重 |
| 60 | 2026-08-07 | 回溯：切割 | 0131 Palindrome Partitioning [M] | 0093 Restore IP Addresses [M] | 切割线模型 |
| 61 | 2026-08-08 | 回溯：棋盘 | 0051 N-Queens [H] | 0052 N-Queens II [H] | 约束剪枝 |
| 62 | 2026-08-09 | 回溯：网格 | 0079 Word Search [M] | 0212 Word Search II [H] | 网格 DFS + Trie 剪枝 |
| 63 | 2026-08-10 | 图：岛屿 | 0200 Number of Islands [M] | 0695 Max Area of Island [M] | 网格 DFS/BFS |
| 64 | 2026-08-11 | 图：多源 BFS | 0994 Rotting Oranges [M] | 0542 01 Matrix [M] | 层序扩散 |
| 65 | 2026-08-12 | 图：拓扑 | 0207 Course Schedule [M] | 0210 Course Schedule II [M] | 入度、环检测 |
| 66 | 2026-08-13 | 图：拓扑进阶 | 0802 Find Eventual Safe States [M] | 0269 Alien Dictionary [H] | 反图/字典序建图 |
| 67 | 2026-08-14 | 并查集：基础 | 0547 Number of Provinces [M] | 0684 Redundant Connection [M] | 连通性维护 |
| 68 | 2026-08-15 | 并查集：进阶 | 0399 Evaluate Division [M] | 0305 Number of Islands II [H] | 带权并查集、动态连通 |
| 69 | 2026-08-16 | 最短路：Dijkstra | 0743 Network Delay Time [M] | 1514 Path with Maximum Probability [M] | 优先队列最短路 |
| 70 | 2026-08-17 | 最短路：网格 | 1091 Shortest Path in Binary Matrix [M] | 1631 Path With Minimum Effort [M] | BFS/Dijkstra/二分答案 |
| 71 | 2026-08-18 | 图：最小生成树 | 1584 Min Cost to Connect All Points [M] | 0787 Cheapest Flights Within K Stops [M] | Kruskal/限制步数最短路 |
| 72 | 2026-08-19 | DP：线性基础 | 0070 Climbing Stairs [E] | 0198 House Robber [M] | 状态定义与滚动变量 |
| 73 | 2026-08-20 | DP：环形与乘积 | 0213 House Robber II [M] | 0152 Maximum Product Subarray [M] | 拆环、最大最小同时维护 |
| 74 | 2026-08-21 | DP：股票状态机 | 0121 Best Time to Buy and Sell Stock [E] | 0309 Best Time to Buy and Sell Stock with Cooldown [M] | 持有/不持有状态 |
| 75 | 2026-08-22 | DP：网格 | 0062 Unique Paths [M] | 0064 Minimum Path Sum [M] | 二维 DP 压缩 |
| 76 | 2026-08-23 | DP：背包 01 | 0416 Partition Equal Subset Sum [M] | 0494 Target Sum [M] | 01 背包转化 |
| 77 | 2026-08-24 | DP：完全背包 | 0322 Coin Change [M] | 0518 Coin Change II [M] | 最值与计数的遍历顺序 |
| 78 | 2026-08-25 | DP：LIS | 0300 Longest Increasing Subsequence [M] | 0673 Number of Longest Increasing Subsequence [M] | 序列 DP/贪心二分 |
| 79 | 2026-08-26 | DP：双序列 | 1143 Longest Common Subsequence [M] | 0072 Edit Distance [H] | 二维字符串 DP |
| 80 | 2026-08-27 | DP：回文 | 0516 Longest Palindromic Subsequence [M] | 0132 Palindrome Partitioning II [H] | 区间方向与预处理 |
| 81 | 2026-08-28 | DP：区间 | 0312 Burst Balloons [H] | 1039 Minimum Score Triangulation of Polygon [M] | 枚举最后一步 |
| 82 | 2026-08-29 | DP：状态压缩 | 0691 Stickers to Spell Word [H] | 0847 Shortest Path Visiting All Nodes [H] | bitmask 状态 |
| 83 | 2026-08-30 | 设计：随机结构 | 0380 Insert Delete GetRandom O(1) [M] | 0381 Insert Delete GetRandom O(1) - Duplicates allowed [H] | 哈希 + 数组，重复值索引集合 |
| 84 | 2026-08-31 | 设计：AllOne/Skiplist | 0432 All O`one Data Structure [H] | 1206 Design Skiplist [H] | 桶链表、跳表 |
| 85 | 2026-09-01 | Trie/位运算：异或 | 0421 Maximum XOR of Two Numbers in an Array [M] | 1707 Maximum XOR With an Element From Array [H] | 二进制 Trie，离线排序 |
| 86 | 2026-09-02 | 位运算：基础到区间 | 0136 Single Number [E] | 0201 Bitwise AND of Numbers Range [M] | 异或、公共前缀 |
| 87 | 2026-09-03 | 线段树/BIT | 0307 Range Sum Query - Mutable [M] | 0315 Count of Smaller Numbers After Self [H] | 树状数组/线段树离散化 |
| 88 | 2026-09-04 | 扫描线 | 0850 Rectangle Area II [H] | 0218 The Skyline Problem [H] | 事件排序、活动集合 |
| 89 | 2026-09-05 | 系统设计味算法 | 0721 Accounts Merge [M] | 0635 Design Log Storage System [M] | 并查集/时间编码 |
| 90 | 2026-09-06 | 收官模拟 | 0289 Game of Life [M] | 0068 Text Justification [H] | 原地状态压缩、复杂模拟 |

## 使用规则

1. **当天两题必须写代码入库**：不要只写笔记。
2. **笔记写宏观模型**：具体细节、坑点、指针不变量写到代码注释里。
3. **提交粒度**：每天一个 commit；如果当天有对比笔记，也和代码一起提交。
4. **难题处理**：Hard 超过 75 分钟仍无思路，先写暴力/关键不变量，再看题解并二刷。
5. **验收标准**：三个月后随机抽 40 题，Medium 35 分钟内、Hard 70 分钟内完成率达到 75%。
