/*
 * @lc app=leetcode.cn id=671 lang=java
 *
 * [671] 二叉树中第二小的节点
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    int smin;

    public int findSecondMinimumValue(TreeNode root) {
        return helper(root, root.val);
    }

    int helper(TreeNode root, int min) {
        if (root == null)
            return -1;

        if (root.val > min)
            return root.val;

        int left = helper(root.left, min);
        int right = helper(root.right, min);
        // 整个左子树都没有找到大于跟节点的Node，所以直接返回右子树
        if (left == -1)
            return right;
        if (right == -1)
            return left;
        return Math.min(left, right);
    }
}
// @lc code=end
