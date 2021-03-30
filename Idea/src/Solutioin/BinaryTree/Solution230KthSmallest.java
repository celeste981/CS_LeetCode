/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution230KthSmallest
 * Author:   CS
 * Date:     2021/3/29 17:07
 * Description: 二叉搜索树中第K小的元素
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉搜索树中第K小的元素〉
 *
 * @author CS
 * @create 2021/3/29
 * @since 1.0.0
 */
public class Solution230KthSmallest {

    int ans = 0;
    int rank = 0;
    public int kthSmallest(TreeNode root, int k) {
        preOrder( root , k );
        return ans;
    }

    public void preOrder ( TreeNode root , int k ) {
        if ( root == null ) {
            return ;
        }
        preOrder( root.left , k );
        rank++;
        if ( rank == k ) {
            ans = root.val;
            return ;
        }
        preOrder( root.right , k );
    }

    public static void main(String[] args) {

    }
}
