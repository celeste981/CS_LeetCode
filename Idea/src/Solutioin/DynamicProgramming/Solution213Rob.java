/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution213Rob
 * Author:   CS
 * Date:     2021/4/15 9:21
 * Description: 打家劫舍||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈打家劫舍||〉
 * 比打家劫舍多了头尾相连的限制
 * 有三种情况
 * 1.头尾都不抢
 * 2.抢头不抢尾
 * 3.抢尾不抢头
 *综上分析，只需要比较 2、3 两种情况即可，2、3抢到的钱肯定比 1 多
 * 直接排除第一种方法
 * @author CS
 * @create 2021/4/15
 * @since 1.0.0
 */
public class Solution213Rob {

    public int rob ( int[] nums ) {
        if ( nums.length == 0 ) {
            return 0;
        }
        if ( nums.length == 1 ) {
            return nums[0];
        }
//        int[] robHead = Arrays.copyOfRange( nums , 0 , nums.length - 2 );
//        int[] robTail = Arrays.copyOfRange( nums , 1 , nums.length - 1 );
        return Math.max( rob( nums , 0 , nums.length - 2 ) , rob( nums , 1 , nums.length - 1 ) );
    }

    public int rob ( int[] nums , int start , int end ) {
        int len = end - start + 1;
        if ( len == 0 ) {
            return 0;
        }
        if ( len == 1 ) {
            return nums[start];
        }
        int a = nums[start] , b = Math.max( nums[start] , nums[start+1] );
        for ( int i = start + 2 ; i <= end ; i++ ) {
            int cur = Math.max( nums[i] + a , b ) ;
            a = b;
            b = cur;
        }
        return b;
    }

    public static void main(String[] args) {
        Solution213Rob solution213Rob = new Solution213Rob();
        //2,3,2
        //1,2,3,1
        //1,3,1,3,100
        System.out.println(solution213Rob.rob(new int[]{1,3,1,3,100}));
    }

}
