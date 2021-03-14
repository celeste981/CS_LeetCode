/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: IsSymmetric
 * Author:   CS
 * Date:     2021/3/12 16:13
 * Description: 对称二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈对称二叉树〉
 *
 * @author CS
 * @create 2021/3/12
 * @since 1.0.0
 */
public class IsSymmetric {

    public boolean isSymmetricIteration(TreeNode root) {
        //队列同时入两棵树
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right == null) {
                continue;
            }
            if ( (left == null || right == null) || left.val != right.val ) {
                return false;
            }
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }
        return true;
    }

    //迭代:无法区分镜像的子结点是不是来自镜像的父节点
//    [2,3,3,4,5,5,4,null,null,8,9,null,null,9,8]
//        Deque<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            Deque<TreeNode> level = new LinkedList<>();
//            int n = queue.size();
//            for (int i = 0 ; i < n ; i++ ) {
//                TreeNode tmp = queue.poll();
//                if (tmp == null || (tmp.left == null && tmp.right == null) ) {
//                    continue;
//                }
//                queue.offer(tmp.left);
//                queue.offer(tmp.right);
//                level.offer(tmp.left);
//                level.offer(tmp.right);
//            }
//            while (!level.isEmpty()) {
//                TreeNode left = level.removeFirst();
//                TreeNode right = level.removeLast();
//                if (left == null && right == null){
//                    continue;
//                } else if (left == null || right == null) {
//                    return false;
//                } else if (left.val != right.val) {
//                    return false;
//                }
//            }
//        }
//        return true;

    public boolean isSymmetricRecursion(TreeNode root) {
        return isMirror(root.left , root.right);
    }

    public boolean isMirror(TreeNode left , TreeNode right) {
        //先判断是否是null
        //如果left或者right是null ，根本获取不了val ， 进不了if else ，就没有返回值
        if (left == null && right == null) {
            return true;
        }
        if ( ( left == null || right == null) || left.val != right.val) {
            return false;
        }
        return isMirror(left.left , right.right) && isMirror(left.right , right.left);
    }

    public static void main(String[] args) {


//        TreeNode root = new TreeNode(1);
//        TreeNode l = new TreeNode(2);
//        TreeNode r = new TreeNode(2);
//        root.left = l; root.right = r;
//        TreeNode ll = new TreeNode(3);
//        TreeNode lr = new TreeNode(4);
//        l.left = ll; l.right = lr;
//        TreeNode rl = new TreeNode(4);
//        TreeNode rr = new TreeNode(3);
//        r.left = rl;         r.right = rr;

//        TreeNode root = new TreeNode(1);
//        TreeNode l = new TreeNode(2);
//        TreeNode r = new TreeNode(2);
//        root.left = l; root.right = r;
////        TreeNode ll = new TreeNode(4);
//        TreeNode lr = new TreeNode(3);
//         l.right = lr;
//        //TreeNode rl = new TreeNode(1);
//        TreeNode rr = new TreeNode(3);
///*r.left = rl;*/         r.right = rr;

        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(2);
        root.left = l; root.right = r;
//        TreeNode ll = new TreeNode(4);
        TreeNode lr = new TreeNode(3);
         l.right = lr;
        TreeNode rl = new TreeNode(3);
//        TreeNode rr = new TreeNode(3);
        r.left = rl;
//        r.right = rr;

        IsSymmetric isSymmetric = new IsSymmetric();
        System.out.println(isSymmetric.isSymmetricRecursion(root));

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
