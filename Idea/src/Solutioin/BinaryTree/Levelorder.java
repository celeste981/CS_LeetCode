/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Levelorder
 * Author:   CS
 * Date:     2021/3/12 15:14
 * Description: 二叉树的层序遍历
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 〈一句话功能简述〉<br>
 *
 * 〈二叉树的层序遍历 102〉
 *
 * @author CS
 * @create 2021/3/12
 * @since 1.0.0
 */
public class Levelorder {

    public void levelTraversal(TreeNode root) {
        Deque<TreeNode> queque = new LinkedList<>();
        queque.offer(root);
        while (!queque.isEmpty()) {
            TreeNode tmp = queque.poll();
            System.out.println(tmp.val);
            if (tmp.left != null) {
                queque.offer(tmp.left);
            }
            if (tmp.right != null) {
                queque.offer(tmp.right);
            }
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new LinkedList<>();
            int n = queue.size();
            //用for循环来限制每一层，因为每层都要重新new一个level list
            for (int i = 0 ; i < n ; i++ ) {
                TreeNode tmp = queue.poll();
                if (tmp.left != null) {
                    queue.offer(tmp.left);
                }
                if (tmp.right != null) {
                    queue.offer(tmp.right);
                }
                level.add(tmp.val);
            }
            ans.add(level);
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
        Levelorder levelorder = new Levelorder();
//        System.out.println(levelorder.levelOrder(root));
        levelorder.levelTraversal(root);
    }
}
