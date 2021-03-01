/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Array2
 * Author:   CS
 * Date:     2021/2/11 17:19
 * Description: 买股票最佳时机：给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。  设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package PrimaryAlgorithm.Array;

/**
 * 〈一句话功能简述〉<br> 
 * 〈买股票最佳时机：
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。
 * 你可以尽可能地完成更多的交易（多次买卖一支股票）。〉
 *
 * @author CS
 * @create 2021/2/11
 * @since 1.0.0
 */
public class Array2 {
    public int maxProfit(int[] prices) {
        //买卖股票的最佳时机
        int ans = 0;
        //暴力法
//        for (int i = 0 ; i < prices.length ; i++ ) {
//            for (int j = i+1 ; j < prices.length ; j++ ) {
//                ans = prices[j] - prices[i] > ans ? prices[j] - prices[i] : ans;
//            }
//        }
        //历史最低点
        int min = prices[0] , max = 0;
        for ( int price : prices ) {
            if(price < min){
                min = price;
            }
            if( (price - min) > max ) {
                max = (price - min) ;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Array2 array2 = new Array2();
        System.out.println(array2.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
