/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: HasPathSum
 * Author:   CS
 * Date:     2021/3/14 10:54
 * Description: 路径总和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈路径总和〉
 *
 * @author CS
 * @create 2021/3/14
 * @since 1.0.0
 */
public class HasPathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if (root == null && targetSum == 0) {
//            return true;
//        }
        if (root == null) {
            return false;
        }
        if ( root.left == null && root.right == null) {
             return root.val == targetSum;
        }
        return hasPathSum( root.left , targetSum - root.val) || hasPathSum( root.right , targetSum - root.val) ;
    }

    public static void main(String[] args) {

    }
}
