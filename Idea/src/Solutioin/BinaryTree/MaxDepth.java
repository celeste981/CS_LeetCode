/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: MaxDepth
 * Author:   CS
 * Date:     2021/3/12 16:07
 * Description: 二叉树的最大深度
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的最大深度〉
 *
 * @author CS
 * @create 2021/3/12
 * @since 1.0.0
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left) , maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {

    }
}
