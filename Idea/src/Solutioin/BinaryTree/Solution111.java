/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution111
 * Author:   Administrator
 * Date:     2021/3/17 17:13
 * Description: 二叉树的最小深度
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的最小深度〉
 *
 * @author Administrator
 * @create 2021/3/17
 * @since 1.0.0
 */
public class Solution111 {

    public int minDepth ( TreeNode root ) {
        int ans = 0;
        if ( root == null ) {
            return ans;
        }
        Deque< TreeNode > queue = new LinkedList<>();
        queue.offer(root);
        while ( !queue.isEmpty() ) {
            int size = queue.size();
            ans++;
            for ( int i = 0 ; i < size ; i++ ) {
                TreeNode temp = queue.poll();
                if ( temp.left == null && temp.right == null ) {
                    return ans;
                } else {
                    if ( temp.left != null ) {
                        queue.offer(temp.left);
                    }
                    if ( temp.right != null ) {
                        queue.offer(temp.right);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution111 solution111 = new Solution111();
    }
}
