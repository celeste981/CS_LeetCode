/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution322CoinChange
 * Author:   CS
 * Date:     2021/3/30 15:26
 * Description: 零钱兑换
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;

import java.util.Arrays;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈零钱兑换〉
 *
 * @author CS
 * @create 2021/3/30
 * @since 1.0.0
 */
public class Solution322CoinChange {

    public int coinChange ( int[] coins , int amount ) {
        int[] dp = new int[ amount + 1 ];
        Arrays.fill( dp , amount + 1 );
        dp[0] = 0;
        for ( int i = 0 ; i < amount + 1 ; i++ ) {
            for ( int coin : coins ) {
                if ( ( i - coin ) < 0 ) {
                    continue;
                }
                dp[i] = Math.min( dp[i] , 1 + dp[i - coin] );
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Solution322CoinChange solution322CoinChange = new Solution322CoinChange();
        System.out.println( solution322CoinChange.coinChange( new int[] { 1 , 2 , 5 } , 5));
    }
}
