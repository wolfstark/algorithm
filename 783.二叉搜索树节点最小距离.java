/*
 * @lc app=leetcode.cn id=783 lang=java
 *
 * [783] 二叉搜索树节点最小距离
 */

// @lc code=start

// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    Integer pre, min = null;

    public int minDiffInBST(TreeNode root) {
        min = Integer.MAX_VALUE;
        helper(root);
        return min;
    }

    void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        if (pre != null) {
            min = Math.min(root.val - pre, min);
        }
        pre = root.val;
        helper(root.right);
    }
}
// @lc code=end
