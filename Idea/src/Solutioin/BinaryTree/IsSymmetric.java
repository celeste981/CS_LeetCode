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
        //迭代
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Deque<TreeNode> level = new LinkedList<>();
            int n = queue.size();
            for (int i = 0 ; i < n ; i++ ) {
                TreeNode tmp = queue.poll();
                level.offer(tmp.left);
                level.offer(tmp.right);
            }
            while (!level.isEmpty()) {
                TreeNode left = level.removeFirst();
                TreeNode right = level.removeLast();
                if (left == right && right == null){
                    continue;
                } else if (left == null || right == null) {
                    return false;
                } else if (left.val != right.val) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
