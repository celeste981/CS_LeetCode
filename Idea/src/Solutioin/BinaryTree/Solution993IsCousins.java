/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution993IsCousins
 * Author:   Administrator
 * Date:     2021/5/17 9:03
 * Description: 二叉树的堂兄弟节点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的堂兄弟节点〉
 *
 * @author Administrator
 * @create 2021/5/17
 * @since 1.0.0
 */
public class Solution993IsCousins {

    int depth = 0;
    int xDepth = 0, yDepth = 0;
    TreeNode xParent = null, yParent = null;

    public boolean isCousins(TreeNode root, int x, int y) {
        preOrder(root, x, y, null);
        return xDepth == yDepth && xParent != yParent;
    }

    public void preOrder(TreeNode root, int x, int y, TreeNode parent) {
        if (root == null) {
            return;
        }
        depth++;
        if (root.val == x) {
            xDepth = depth;
            xParent = parent;
            System.out.println("xVal is: " + x);
            System.out.println("xDpeth is: " + xDepth);
            System.out.println("xParentVal is: " + xParent.val);
        }
        if (root.val == y) {
            yDepth = depth;
            yParent = parent;
            System.out.println("yVal is: " + y);
            System.out.println("yDpeth is: " + yDepth);
            System.out.println("yParentVal is: " + yParent.val);
        }
        if (xParent != null && yParent != null) {
            return;
        }
        preOrder(root.left, x, y, root);
        preOrder(root.right, x, y, root);
        depth--;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node2.left = null;
        node2.right = node4;
        node3.left = null;
        node3.right = node5;
        node4.left = null;
        node4.right = null;
        node5.left = null;
        node5.right = null;
        Solution993IsCousins solution993IsCousins = new Solution993IsCousins();
        System.out.println(solution993IsCousins.isCousins(node1, 5, 4));
    }
}
