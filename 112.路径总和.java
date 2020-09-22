/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    int n = 0;

    public boolean hasPathSum(TreeNode root, int sum) {
        n = sum;
        return helper(root, 0);
        // return n == sum;
    }

    boolean helper(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null)
            return sum + root.val == n;

        return helper(root.left, sum + root.val) || helper(root.right, sum + root.val);
    }
}
// @lc code=end
