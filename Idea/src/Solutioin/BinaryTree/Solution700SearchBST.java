/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution700SearchBST
 * Author:   CS
 * Date:     2021/3/30 9:59
 * Description: 二叉搜索树中的搜索
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉搜索树中的搜索〉
 *
 * @author CS
 * @create 2021/3/30
 * @since 1.0.0
 */
public class Solution700SearchBST {

    public TreeNode searchBST ( TreeNode root , int val ) {
        if ( root == null ) {
            return null;
        }
        if ( val == root.val ) {
            return root;
        } else if ( val < root.val ) {
            return searchBST( root.left , val );
        } else {
            return searchBST( root.right , val );
        }
    }

    public static void main(String[] args) {

    }
}
