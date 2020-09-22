/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root, root);
    }

    boolean helper(TreeNode q, TreeNode p) {
        if (q == null && p == null)
            return true;
        if (q == null || p == null)
            return false;
        return q.val == p.val && helper(q.left, p.right) && helper(q.right, p.left);
    }
}
// @lc code=end
