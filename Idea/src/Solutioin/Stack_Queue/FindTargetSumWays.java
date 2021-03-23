/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: FindTargetSumWays
 * Author:   CS
 * Date:     2021/3/23 9:47
 * Description: 目标和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈目标和〉
 *
 * @author CS
 * @create 2021/3/23
 * @since 1.0.0
 */
public class FindTargetSumWays {

    int ans = 0;
    public int findTargetSumWays ( int[] nums , int S ) {
        calculate( nums , 0 , 0 , S);
        return ans;
    }

    public void calculate ( int[] nums , int depth , int tempSum , int S ) {
        if ( depth == nums.length ) {
            if ( tempSum == S ) {
                ans++;
            }
        } else {
            calculate( nums , depth + 1 , tempSum + nums[depth] , S );
            calculate( nums , depth + 1 , tempSum - nums[depth] , S );
        }
    }

    public static void main(String[] args) {

    }
}
