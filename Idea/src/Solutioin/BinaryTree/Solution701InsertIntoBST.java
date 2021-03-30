/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution701InsertIntoBST
 * Author:   CS
 * Date:     2021/3/30 10:04
 * Description: 二叉搜索树中的插入操作
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉搜索树中的插入操作〉
 *
 * @author CS
 * @create 2021/3/30
 * @since 1.0.0
 */
public class Solution701InsertIntoBST {

    public TreeNode insertIntoBST ( TreeNode root , int val ) {
        if ( root == null ) {
            return new TreeNode( val );
        }
        if ( val < root.val ) {
            root.left = insertIntoBST( root.left , val );
        }
        if ( val > root.val ) {
            root.right = insertIntoBST( root.right , val );
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
