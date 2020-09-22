/*
 * @lc app=leetcode.cn id=897 lang=java
 *
 * [897] 递增顺序查找树
 */

// @lc code=start

// Definition for a binary tree node.
// public class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int x) {
//         val = x;
//     }
// }

class Solution {
    TreeNode current;
    List<Integer> list = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {
        TreeNode tree = new TreeNode(0);
        current = tree;
        helper(root);
        return tree.right;
    }

    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        root.left = null;
        current.right = root;
        current = current.right;
        helper(root.right);
    }
}
// @lc code=end
