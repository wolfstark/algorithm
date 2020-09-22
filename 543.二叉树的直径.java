/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    int ans = 1;

    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return ans - 1;
    }

    int helper(TreeNode root) {
        if (root == null)
            return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        ans = Math.max(left + right + 1, ans);
        return Math.max(left, right) + 1;
    }
}
// @lc code=end
