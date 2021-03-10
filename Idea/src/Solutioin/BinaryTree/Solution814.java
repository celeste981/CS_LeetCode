/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution814
 * Author:   CS
 * Date:     2021/3/10 9:43
 * Description: 二叉树剪枝
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树剪枝〉
 *
 * @author CS
 * @create 2021/3/10
 * @since 1.0.0
 */
public class Solution814 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode pruneTree(TreeNode root) {
        if (root == null ) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        }
        return root;
    }

//    public TreeNode prune;

    public static void main(String[] args) {
        Solution814 solution814 = new Solution814();
    }
}
