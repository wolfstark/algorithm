/*
 * @lc app=leetcode.cn id=965 lang=java
 *
 * [965] 单值二叉树
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
    int val;

    public boolean isUnivalTree(TreeNode root) {
        val = root.val;
        return helper(root);
    }

    public boolean helper(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.val == val) {
            return helper(root.left) && helper(root.right);
        } else {
            return false;
        }
    }
}
// @lc code=end
