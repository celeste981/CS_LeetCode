/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution938RangeSunBST
 * Author:   CS
 * Date:     2021/4/27 10:42
 * Description: 二叉搜索树的范围和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉搜索树的范围和〉
 *
 * @author CS
 * @create 2021/4/27
 * @since 1.0.0
 */
public class Solution938RangeSumBST {

//    int ans = 0;
//    public int rangeSumBST(TreeNode root, int low, int high) {
//        dfs(root, low, high);
//        return ans;
//    }
//
//    public void dfs(TreeNode root, int low, int high) {
//        if (root == null) {
//            return;
//        }
//        dfs(root.left, low, high);
//        if (root.val >= low && root.val <= high) {
//            ans += root.val;
//        }
//        dfs(root.right, low, high);
//    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans = 0;
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val >= low && root.val <= high) {
                ans += root.val;
            }
            root = root.right;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
