import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=1325 lang=java
 *
 * [1325] 删除给定值的叶子节点
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) return null;
        TreeNode left = removeLeafNodes(root.left , target);
        TreeNode right = removeLeafNodes(root.right , target);
        root.left = left;
        root.right = right;
        if(root.left == null && root.right == null && root.val == target){
            return null;
        }
        return root;
    }
}
// @lc code=end

