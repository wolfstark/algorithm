import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=993 lang=java
 *
 * [993] 二叉树的堂兄弟节点
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    Map<Integer, Integer> depth = new HashMap<>();;
    Map<Integer, TreeNode> parent = new HashMap<>();;

    public boolean isCousins(TreeNode root, int x, int y) {
        helper(root, null, 1);
        return depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y);
    }

    void helper(TreeNode root, TreeNode p, int d) {
        if (root == null)
            return;
        depth.put(root.val, d);
        parent.put(root.val, p);
        helper(root.left, root, d + 1);
        helper(root.right, root, d + 1);
    }
}
// @lc code=end
