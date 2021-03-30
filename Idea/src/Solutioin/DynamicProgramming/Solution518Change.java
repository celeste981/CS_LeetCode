/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution518Change
 * Author:   CS
 * Date:     2021/3/30 16:01
 * Description: 零钱兑换|
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;

/**
 * 〈一句话功能简述〉<br> 
 * 〈零钱兑换||〉
 *
 * @author CS
 * @create 2021/3/30
 * @since 1.0.0
 */
public class Solution518Change {

    public  int change ( int[] coins , int amount ) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
//        for ( int coin : coins ) {
//            for ( int i = coin ; i <= amount ; i++ ) {
//                dp[i] += dp[ i - coin];
//            }
//        }
        for ( int i = 1 ; i <= amount ; i++ ) {
            for ( int coin : coins ) {
                if ( ( i -  coin ) >= 0 ) {
                    dp[i] += dp[i - coin];
                }
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        Solution518Change solution518Change = new Solution518Change();
        System.out.println( solution518Change.change( new int[]{1,2,5} , 5 ));
    }
}
