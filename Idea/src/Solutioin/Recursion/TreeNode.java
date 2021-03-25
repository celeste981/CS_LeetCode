/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: TreeNode
 * Author:   CS
 * Date:     2021/3/12 14:06
 * Description: 二叉树节点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Recursion;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树节点〉
 *
 * @author CS
 * @create 2021/3/12
 * @since 1.0.0
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(9);
//        TreeNode l = new TreeNode(3);
//        TreeNode r = new TreeNode(2);
//        root.left = l; root.right = r;
//        TreeNode ll = new TreeNode(4);
//        TreeNode lr = new TreeNode(1);
//        l.left = ll; l.right = lr;
//        //TreeNode rl = new TreeNode(1);
//        TreeNode rr = new TreeNode(6);
///*r.left = rl;*/         r.right = rr;
    }

}
