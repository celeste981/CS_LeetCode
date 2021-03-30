/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Preorder
 * Author:   CS
 * Date:     2021/3/10 17:10
 * Description: 前序遍历递归&迭代
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈前序遍历递归&迭代  144〉
 *
 * @author CS
 * @create 2021/3/10
 * @since 1.0.0
 */
public class Preorder {


    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorderRecursion(TreeNode root) {

        recursion(root);
        return ans;
    }

    public TreeNode recursion(TreeNode root) {
        if (root == null ){
            return null;
        }
        ans.add(root.val);
        root.left = recursion(root.left);
        root.right = recursion(root.right);
        return root;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> occ = new Stack<>();
        while (root != null || !occ.isEmpty()) {
            while (root != null) {
                occ.push(root);
                ans.add(root.val);
                root = root.left;
            }
            root = occ.pop().right;
        }
        return ans;
    }

    public static void main(String[] args) {
        Preorder preorder = new Preorder();
    }
}
