/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution530783MinDiffInBST
 * Author:   CS
 * Date:     2021/4/13 8:59
 * Description: 二叉搜索树节点最小距离
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉搜索树节点最小距离〉
 *
 * @author CS
 * @create 2021/4/13
 * @since 1.0.0
 */
public class Solution530783MinDiffInBST {

    int ans = Integer.MAX_VALUE;
    TreeNode pre = null;
    public int minDiffInBST ( TreeNode root ) {
        inOrder( root );
        return ans;
    }

    public void inOrder ( TreeNode root ) {
        if ( root == null ) {
            return ;
        }
        inOrder(root.left);
        if ( pre != null ) {
            ans = Math.min( root.val - pre.val , ans );
        }
        pre = root;
        inOrder(root.right);
    }

    public static void main(String[] args) {

    }
}
