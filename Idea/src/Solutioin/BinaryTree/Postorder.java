/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Postorder
 * Author:   CS
 * Date:     2021/3/12 9:47
 * Description: 二叉树的后序遍历
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import Solutioin.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的后序遍历 145〉
 *
 * @author CS
 * @create 2021/3/12
 * @since 1.0.0
 */
public class Postorder {

//    public List<Integer> postorderTraversal(TreeNode root) {
//        LinkedList<Integer> ans = new LinkedList<>();
//        Deque<TreeNode> stack = new LinkedList<>();
//        TreeNode prev = null;
//        while (root != null || !stack.isEmpty()) {
//            while (root != null) {
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.peek();
//            if (root.right == null || root.right == prev) {
//                ans.add(stack.pop().val);
//                prev = root;
//                root = null;
//            } else {
//                root = root.right;
//            }
//        }
//        return ans;
//    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode prev = null;
        while ( root != null || !stack.isEmpty() ) {
            while ( root != null ) {
                stack.push(root);
                root = root.left;
            }
            root = stack.peek();
            if ( root.right == null || root.right == prev) {
                ans.add(stack.pop().val);
                prev = root;
                root = null;
            } else {
                root = root.right;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        TreeNode l = new TreeNode(3);
        TreeNode r = new TreeNode(2);
        root.left = l; root.right = r;
        TreeNode ll = new TreeNode(4);
        TreeNode lr = new TreeNode(1);
        l.left = ll; l.right = lr;
        //TreeNode rl = new TreeNode(1);
        TreeNode rr = new TreeNode(6);
        /*r.left = rl;*/         r.right = rr;
        Postorder postorder = new Postorder();
        System.out.println(postorder.postorderTraversal(root));
    }
}
