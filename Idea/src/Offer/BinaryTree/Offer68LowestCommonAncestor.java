/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer68LowestCommonAncestor
 * Author:   CS
 * Date:     2021/4/26 15:10
 * Description: 二叉搜索树的最近公共祖先
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉搜索树的最近公共祖先〉
 *  若root是p、q的最近公共祖先，则只可能为以下情况之一：
 *      1.p和q在root的子树中，且分列root的异侧；
 *      2.p = root，且q在root的左子树或右子树中；
 *      3.q = root，且p在root的左子树或右子树中。
 * @author CS
 * @create 2021/4/26
 * @since 1.0.0
 */
public class Offer68LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root , TreeNode p , TreeNode q) {
        //优化，保证p.val < q.val 在循环中减少判断条件
        if (p.val > q.val) {
            TreeNode tmp = p;
            p = q;
            q = tmp;
        }
        while (root != null) {
            if (p.val > root.val) {
                //pq同在右侧
                root = root.right;
            } else if (q.val < root.val) {
                //pq同在左侧
                root = root.left;
            } else {
                //1.pq有人就是root
                //2.pq在异侧
                break;
            }
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
