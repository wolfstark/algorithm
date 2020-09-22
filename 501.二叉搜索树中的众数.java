import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=501 lang=java
 *
 * [501] 二叉搜索树中的众数
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    int max = 0;

    public int[] findMode(TreeNode root) {
        List<Integer> lis = new ArrayList<>();
        inOrder(root);

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == max) {
                lis.add(m.getKey());
            }
        }
        int[] res = new int[lis.size()];
        for (int i = 0; i < lis.size(); i++) {
            res[i] = lis.get(i);
        }
        return res;
    }

    public void inOrder(TreeNode root) {
        if (root == null)
            return;
        int c = map.getOrDefault(root.val, 0) + 1;
        max = Math.max(max, c);
        map.put(root.val, c);

        inOrder(root.left);
        inOrder(root.right);
    }

}
// @lc code=end
