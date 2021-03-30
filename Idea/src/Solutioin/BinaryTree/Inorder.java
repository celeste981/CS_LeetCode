/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Inorder
 * Author:   CS
 * Date:     2021/3/12 9:32
 * Description: 二叉树的中序遍历
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的中序遍历 94〉
 *
 * @author CS
 * @create 2021/3/12
 * @since 1.0.0
 */
public class Inorder {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
