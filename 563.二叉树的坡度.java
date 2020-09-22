/*
 * @lc app=leetcode.cn id=563 lang=java
 *
 * [563] 二叉树的坡度
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    int sum = 0;

    public int findTilt(TreeNode root) {
        // root.left
        helper(root);

        return sum;

    }

    int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // root.left
        int left = helper(root.left);
        int right = helper(root.right);

        sum += Math.abs(left - right);

        return root.val + left + right;

        // return Math.abs(helper(root.left) - helper(root.right));
        // return helper(root.left) + helper(root.right);
    }
}
// @lc code=end
