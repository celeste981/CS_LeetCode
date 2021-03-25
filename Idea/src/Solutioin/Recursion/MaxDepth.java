/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: MaxDepth
 * Author:   CS
 * Date:     2021/3/25 9:28
 * Description: 二叉树的最大深度
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Recursion;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的最大深度〉
 *
 * @author CS
 * @create 2021/3/25
 * @since 1.0.0
 */
public class MaxDepth {

    public int maxDepth ( TreeNode root ) {
        if ( root == null ) {
            return 0;
        }
        return 1 + Math.max( maxDepth( root.left ) , maxDepth( root.right ) );
    }

    public static void main(String[] args) {

    }
}
