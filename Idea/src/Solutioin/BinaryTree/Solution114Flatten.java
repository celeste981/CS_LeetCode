/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution114Flatten
 * Author:   CS
 * Date:     2021/3/20 23:04
 * Description: 二叉树展开为链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import com.sun.source.tree.Tree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树展开为链表〉
 *
 * @author CS
 * @create 2021/3/20
 * @since 1.0.0
 */
public class Solution114Flatten {
//    TreeNode last = null;
//    public void flatten ( TreeNode root ) {
//        recursion( root );
//    }
//
//    public TreeNode recursion ( TreeNode root ) {
//        if ( root == null ) {
//            return null;
//        } else if ( root.left == null && root.right == null ) {
//            last = root;
//            return root;
//        } else if ( root.left == null ) {
//            root.right = recursion(root.right);
//        } else {
//            TreeNode tempRight = root.right;
//            root.right = recursion( root.left ) ;
//            root.left = null;
//            if ( tempRight != null && last != null ) {
//                last.right = recursion( tempRight );
//            }
//        }
//        return root;
//    }

    public void flatten ( TreeNode root ) {
        if ( root == null ) {
            return ;
        }
        flatten( root.left );
        flatten( root.right );

        //实现当前节点拉平
            //保留递归结果
        TreeNode left = root.left;
        TreeNode right = root.right;

        root.right = root.left;
        root.left = null;

        TreeNode temp = root;
        while ( temp.right != null ) {
            temp = temp.right;
        }
        temp.right = right;
    }

    public static void main(String[] args) {

    }
}
