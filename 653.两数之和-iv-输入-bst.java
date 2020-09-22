import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=653 lang=java
 *
 * [653] 两数之和 IV - 输入 BST
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean findTarget(final TreeNode root, final int k) {
        Set<Integer> set = new HashSet<>();
        return helper(root, k, set);
    }

    boolean helper(final TreeNode root, final int k, final Set<Integer> set) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return helper(root.left, k, set) || helper(root.right, k, set);

    }
}
// @lc code=end
