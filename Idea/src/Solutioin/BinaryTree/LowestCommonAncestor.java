/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: LowestCommonAncestor
 * Author:   CS
 * Date:     2021/3/14 14:53
 * Description: 二叉树的最近公共祖先
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的最近公共祖先〉
 *
 * @author CS
 * @create 2021/3/14
 * @since 1.0.0
 */
public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //自顶向下递归
        //pq分别在某个root的左子树和右子树中
        //或pq同时在root的左子树或右子树中
        if ( root == null || p == root || q == root ) {
            return root;
        }
        TreeNode leftRes = lowestCommonAncestor( root.left , p , q );
        TreeNode rightRes = lowestCommonAncestor( root.right , p , q );
        if ( leftRes != null && rightRes != null ) {
            return root;
        }
        if ( leftRes == null && rightRes == null ) {
            return null;
        }
        return leftRes == null ? rightRes : leftRes ;
    }

    public static void main(String[] args) {
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        //System.out.println(lowestCommonAncestor.lowestCommonAncestor(root).val);
    }
}
