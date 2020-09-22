/*
 * @lc app=leetcode.cn id=572 lang=java
 *
 * [572] 另一个树的子树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return t == null;
        }
        return isSame(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
        // if (s == null && t == null)
        // return true;

        // if (s == null || t == null)
        // return false;

        // if (s.val == t.val) {
        // boolean l = isSubtree(s.left, t.left);
        // boolean r = isSubtree(s.right, t.right);

        // return l && r;
        // }

        // boolean l = isSubtree(s.left, t);
        // boolean r = isSubtree(s.right, t);

        // return l || r;
    }

    boolean isSame(TreeNode t1, TreeNode t2) { // takes O(n)
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;

        if (t1.val != t2.val)
            return false;
        return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);
    }

    // boolean helper(TreeNode s, TreeNode t, TreeNode e) {
    // if (s == null && t == null)
    // return true;

    // if (s == null || t == null)
    // return false;

    // if (s.val == t.val) {
    // boolean l = helper(s.left, t.left);
    // boolean r = helper(s.right, t.right);

    // return l && r;
    // }

    // boolean l = helper(s.left, t);
    // boolean r = helper(s.right, t);

    // return l || r;
    // }
}
// @lc code=end
