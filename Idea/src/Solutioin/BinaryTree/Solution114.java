/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution114
 * Author:   Administrator
 * Date:     2021/3/8 9:43
 * Description: 二叉树展开为链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;


/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树展开为链表〉
 *
 * @author Administrator
 * @create 2021/3/8
 * @since 1.0.0
 */
public class Solution114 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val , TreeNode left , TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void flatten(TreeNode root) {
        if (root == null) {
            return ;
        }
        //采用后序遍历位置
        //先拉平左子树
        //再拉平右子树
        //最后拉树根
        flatten(root.left);
        flatten(root.right);

        //实现拉平
        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = left;
        TreeNode temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        temp.right = right;
    }

    public static void main(String[] args) {
        Solution114 solution114 = new Solution114();
    }
}
