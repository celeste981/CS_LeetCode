/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution337Rob
 * Author:   CS
 * Date:     2021/4/15 16:27
 * Description: 打家劫舍|||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;

import Solutioin.TreeNode;

/**
 * 〈一句话功能简述〉<br> 
 * 〈打家劫舍|||〉
 *
 * @author CS
 * @create 2021/4/15
 * @since 1.0.0
 */
public class Solution337Rob {

    public int rob ( TreeNode root ) {
        int[] ans = dp(root);
        return Math.max( ans[0] , ans[1] );
    }

    public int[] dp ( TreeNode root ) {
        if ( root == null ) {
            return new int[]{ 0 , 0 };
        }
        //从上往下递归，假设下面的结果已经做好了
        int[] left = dp( root.left );
        int[] right = dp( root.right );
        // 约定0代表不抢当前节点，1代表抢当前节点
        // 抢当前的结点，就不能抢左右节点
        int robRoot = root.val + left[0] + right[0];
        //不抢当前节点，但也不一定抢左右节点，可以分别加左右节点的最大值
        int notRobRoot = Math.max( left[0] , left[1] ) + Math.max( right[0] , right[1] );
        return new int[]{ notRobRoot , robRoot };
    }

    public static void main(String[] args) {

    }
}
