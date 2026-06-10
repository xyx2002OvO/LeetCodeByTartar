# LeetCode 模块化刷题工作区

起始日期：2026-06-09  
节奏：每天 2 题，约 90 天，共 180 题  
目标：在已经完成 LeetCode Hot 100 的基础上，按模块巩固数据结构基础，并进一步训练算法思维、抽象建模能力和复盘能力。

## 目录结构

```text
leetcode-workspace/
├── README.md              # 工作区说明与刷题方法
├── problem-list.md        # 90 天模块化题单
├── logs/
│   └── daily-log.md       # 每日刷题记录
├── notes/
│   └── review-template.md # 单题复盘模板
├── solutions/             # 代码解答，建议按模块或题号归档
├── templates/             # 常用算法模板
└── scripts/               # 后续可放统计/生成脚本
```

## 每日流程建议

每道题控制在 30-50 分钟：

1. **5 分钟读题建模**：输入规模、边界、是否有序、是否可重复、目标是计数/最值/可行性。
2. **15-25 分钟独立思考与编码**：先写暴力，再优化；不要一上来背答案。
3. **10 分钟调试与复杂度分析**：至少手推 2 个边界用例。
4. **10 分钟复盘**：记录核心转化、模板、易错点。

## 每周复盘

每 7 天做一次复盘：

- 本周最常见的卡点是什么？
- 哪些题其实是同一个模型？
- 是否存在"看懂题解但自己写不出"的题？这些题需要二刷。
- 总结 1-2 个可复用模板。

## 代码命名建议

推荐格式：

```text
solutions/<module>/<problem-id>.<slug>.<ext>
```

例如：

```text
solutions/array-hash/0015.3sum.py
solutions/tree/0105.construct-binary-tree-from-preorder-and-inorder-traversal.py
```

## 难度标记

- E：Easy，主要练习基础实现和边界。
- M：Medium，主力训练题。
- H：Hard，建议先尝试，再看提示，最后复盘核心思路。
