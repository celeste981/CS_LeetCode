/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer32_1levelOrder
 * Author:   CS
 * Date:     2021/5/14 10:03
 * Description: 从上到下打印二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈从上到下打印二叉树〉
 *
 * @author CS
 * @create 2021/5/14
 * @since 1.0.0
 */
public class Offer32_1levelOrder {

    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        List<Integer> ansList = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            ansList.add(cur.val);
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
        int n = ansList.size();
        int[] ansArr = new int[n];
        n--;
        while (n >= 0) {
            ansArr[n] = ansList.remove(n);
            n--;
        }
        return ansArr;
    }

    public static void main(String[] args) {

    }
}
