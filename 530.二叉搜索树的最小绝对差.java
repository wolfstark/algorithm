/*
 * @lc app=leetcode.cn id=530 lang=java
 *
 * [530] 二叉搜索树的最小绝对差
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Integer pre, min = null;

    public int getMinimumDifference(TreeNode root) {
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

