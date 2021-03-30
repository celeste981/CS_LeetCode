/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution538ConvertBST
 * Author:   CS
 * Date:     2021/3/29 17:21
 * Description: 把二叉搜索树转换为累加树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈把二叉搜索树转换为累加树〉
 *
 * @author CS
 * @create 2021/3/29
 * @since 1.0.0
 */
public class Solution538ConvertBST {

    int sum = 0 ;

    public TreeNode convertBST ( TreeNode root ) {
        decreaseOrder( root );
        return root;
    }

    public void decreaseOrder ( TreeNode root ) {
        if ( root == null ) {
            return ;
        }
        decreaseOrder(root.right);
        sum += root.val;
        root.val = sum;
        decreaseOrder( root.left);
    }

    public static void main(String[] args) {

    }
}
