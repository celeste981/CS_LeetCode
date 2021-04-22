/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer07BuildTree
 * Author:   CS
 * Date:     2021/4/20 10:20
 * Description: 重建二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈重建二叉树〉
 *
 * @author CS
 * @create 2021/4/20
 * @since 1.0.0
 */
public class Offer07BuildTree {

    public TreeNode buildTree ( int[] preorder , int[] inorder ) {
        return buildTree( preorder , 0 , preorder.length - 1 , inorder , 0 , inorder.length - 1 );
    }

    public TreeNode buildTree ( int[] preorder , int preBegin , int preEnd , int[] inorder , int inBegin , int inEnd ) {
        if ( preEnd < preBegin) {
            return null;
        }
        int rootIdx = findIdx( inorder , inBegin , inEnd , preorder[preBegin] );
        int lenLeft = rootIdx - inBegin;
//        int lenRight = inEnd - rootIdx;
        TreeNode root = new TreeNode(preorder[preBegin]);
        root.left = buildTree( preorder , preBegin + 1 , preBegin + lenLeft , inorder , inBegin , rootIdx - 1 );
        root.right = buildTree( preorder , preBegin + lenLeft + 1 , preEnd, inorder , rootIdx + 1 , inEnd );
        return root;
    }

    public int findIdx ( int[] nums , int begin , int end , int target ) {
        for ( int i = begin ; i <= end ; i++ ) {
            if ( nums[i] == target ) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
