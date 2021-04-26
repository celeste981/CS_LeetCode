/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution897IncreasingBST
 * Author:   CS
 * Date:     2021/4/25 18:58
 * Description: 递增顺序搜索树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈递增顺序搜索树〉
 *
 * @author CS
 * @create 2021/4/25
 * @since 1.0.0
 */
public class Solution897IncreasingBST {

    TreeNode head = null;
    TreeNode pre = null;

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        inOrder(root);
        pre.right = null;
        pre.left = null;
        return head;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        if (pre == null) {
            head = root;
        } else {
            pre.left = null;
            pre.right = root;
        }
        pre = root;
        inOrder(root.right);
    }

    public static void main(String[] args) {

    }
}
