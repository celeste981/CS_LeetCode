/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution450DeleteBSTNode
 * Author:   CS
 * Date:     2021/3/30 10:16
 * Description: 删除二叉搜索树中的插入操作
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈删除二叉搜索树中的插入操作〉
 *
 * @author CS
 * @create 2021/3/30
 * @since 1.0.0
 */
public class Solution450DeleteBSTNode {

    public TreeNode deleteNode ( TreeNode root , int key ) {
        if ( root == null ) {
            return null;
        }
        if ( root.val == key ) {
            if ( root.left == null && root.right == null ) {
                return null;
            } else if ( root.left == null ) {
                return root.right;
            } else if ( root.right == null ) {
                return root.left;
            } else {
                TreeNode cur = getMin( root.right );
                root.val = cur.val;
                root.right = deleteNode( root.right , cur.val );
            }
        } else if ( root.val > key ) {
            root.left = deleteNode( root.left , key );
        } else if ( root.val < key ) {
            root.right = deleteNode( root.right , key );
        }
        return root;
    }

    public TreeNode getMin ( TreeNode root ) {
        while ( root.left != null ) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
