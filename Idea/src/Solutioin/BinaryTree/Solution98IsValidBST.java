/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution98
 * Author:   CS
 * Date:     2021/2/7 19:28
 * Description: 验证二叉搜索树：给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;


import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈验证二叉搜索树：给定一个二叉树，判断其是否是一个有效的二叉搜索树。〉
 *
 *  * Definition for a binary tree node.
 *  * public class TreeNode {
 *  *     int val;
 *  *     TreeNode left;
 *  *     TreeNode right;
 *  *     TreeNode() {}
 *  *     TreeNode(int val) { this.val = val; }
 *  *     TreeNode(int val, TreeNode left, TreeNode right) {
 *  *         this.val = val;
 *  *         this.left = left;
 *  *         this.right = right;
 *  *     }
 *  * }
 *
 * @author CS
 * @create 2021/2/7
 * @since 1.0.0
 */
public class Solution98IsValidBST {

    public boolean isValidBST(TreeNode node , long lower , long upper) {
        if(node == null){
            return true;
        }
        if(node.val <= lower || node.val >= upper){
            return false;
        }
        return isValidBST(node.left , lower , node.val) && isValidBST(node.right , node.val , upper);
    }
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root , Long.MIN_VALUE , Long.MAX_VALUE);
    }
//
//    public boolean isValidBST(TreeNode root) {
//        boolean ans = true;
//        Stack<TreeNode> occ = new Stack<>();
//        long inorder = Long.MIN_VALUE;
//        while(!occ.isEmpty() || root != null){
//            while(root != null){
//                occ.push(root);
//                root = root.left;
//            }
//            root = occ.pop();
//            if(root.val <= inorder){
//                ans = false;
//            }
//            inorder = root.val;
//            root = root.right;
//        }
//        return ans;
//    }

//    public boolean isValidBST(TreeNode root) {
//        return isValidBST( root , null , null);
//    }
//
//    public boolean isValidBST( TreeNode root , TreeNode min , TreeNode max ) {
//
//        if ( root == null ) {
//            return true;
//        }
//        if ( min != null && root.val <= min.val ) {
//            return false;
//        }
//        if ( max != null && root.val >= max.val ) {
//            return false;
//        }
//        return isValidBST( root.left , min , root) && isValidBST( root.right , root , max);
//    }

    public static void main(String[] args) {
        Solution98IsValidBST solution98 = new Solution98IsValidBST();
    }
}
