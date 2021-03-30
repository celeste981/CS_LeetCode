/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution226
 * Author:   Administrator
 * Date:     2021/3/3 17:06
 * Description: 翻转二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;


import java.time.temporal.Temporal;

/**
 * 〈一句话功能简述〉<br> 
 * 〈翻转二叉树〉
 *
 * @author Administrator
 * @create 2021/3/3
 * @since 1.0.0
 */
public class Solution226 {

    public TreeNode invertTree(TreeNode root) {
         //节点为空返回null
         if (root == null) {
             return null;
         }
         //前序遍历位置
         //交换当前节点的左右子节点
         TreeNode temp;
         temp = root.left;
         root.left = root.right;
         root.right = temp;
         //左右节点继续翻转自己的子节点
         invertTree(root.left);
         invertTree(root.right);
         return root;
    }

    public static void main(String[] args) {
        Solution226 solution226 = new Solution226();
    }
}
