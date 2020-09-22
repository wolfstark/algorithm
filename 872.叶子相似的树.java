import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=872 lang=java
 *
 * [872] 叶子相似的树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        helper(root1, leaves1);
        helper(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    public void helper(TreeNode root, List<Integer> leaves) {
        if (root == null)
            return;
        helper(root.left, leaves);
        helper(root.right, leaves);
        if (root.left == null && root.right == null)
            leaves.add(root.val);
    }
}
// @lc code=end
