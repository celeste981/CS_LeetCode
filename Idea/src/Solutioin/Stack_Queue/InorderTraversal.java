/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: InorderTraversal
 * Author:   CS
 * Date:     2021/3/23 10:08
 * Description: 二叉树的中序遍历
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的中序遍历〉
 *
 * @author CS
 * @create 2021/3/23
 * @since 1.0.0
 */
public class InorderTraversal {

    List<Integer> ans = new LinkedList<>();
    public List< Integer > inorderTraversal ( TreeNode root ) {
        Deque< TreeNode > stack = new ArrayDeque<>();
        while ( root != null || !stack.isEmpty() ) {
            while ( root != null ) {
                stack.push( root );
                root = root.left;
            }
            TreeNode left = stack.pop();
            ans.add( left.val );
            root = left.right;
        }
//        dfs( root );
        return ans;
    }

    public void dfs( TreeNode root ) {
        if ( root == null ) {
            return ;
        }
        dfs( root.left );
        ans.add( root.val );
        dfs( root.right );
    }

    public static void main(String[] args) {

    }
}
