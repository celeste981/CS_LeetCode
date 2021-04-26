/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer68_2LowestCommonAncestor
 * Author:   CS
 * Date:     2021/4/26 16:06
 * Description: 二叉树的最近公共祖先
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的最近公共祖先〉
 *
 * @author CS
 * @create 2021/4/26
 * @since 1.0.0
 */
public class Offer68_2LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root , TreeNode p , TreeNode q) {
        if ( root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left , p , q);
        TreeNode right = lowestCommonAncestor(root.right , p , q);
        if (left == null && right == null) {
            return null;
        } else if (left != null && right != null) {
            return root;
        } else if (left != null) {
            return left;
        } else {
            return right;
        }
    }

    public static void main(String[] args) {

    }
}
