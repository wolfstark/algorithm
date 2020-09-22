/*
 * @lc app=leetcode.cn id=1022 lang=java
 *
 * [1022] 从根到叶的二进制数之和
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return helper(root, 0);
    }

    int helper(TreeNode root, int parentSum) {
        if (root == null) {
            return 0;
        }
        parentSum = parentSum * 2 + root.val;
        if (root.left == null && root.right == null) {
            return parentSum;
        }
        return helper(root.left, parentSum) + helper(root.right, parentSum);
    }
}
// @lc code=end
