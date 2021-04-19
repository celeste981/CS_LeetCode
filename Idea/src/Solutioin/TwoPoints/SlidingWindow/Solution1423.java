/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1423
 * Author:   CS
 * Date:     2021/2/6 0:44
 * Description: 可获得的最大点数：几张卡牌 排成一行，每张卡牌都有一个对应的点数。点数由整数数组 cardPoints 给出。  每次行动，你可以从行的开头或者末尾拿一张卡牌，最终你必须正好拿 k 张卡牌。  你的点数就是你拿到手中的所有卡牌的点数之和。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints.SlidingWindow;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈可获得的最大点数：
 * 几张卡牌 排成一行，每张卡牌都有一个对应的点数。
 * 点数由整数数组 cardPoints 给出。
 * 每次行动，你可以从行的开头或者末尾拿一张卡牌，最终你必须正好拿 k 张卡牌。
 * 你的点数就是你拿到手中的所有卡牌的点数之和。〉
 *
 * @author CS
 * @create 2021/2/6
 * @since 1.0.0
 */
public class Solution1423 {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int windowSize = n - k;
        int sum = 0 , min = Integer.MIN_VALUE;
        for(int i = 0 ; i < windowSize ; i++){
            sum += cardPoints[i];
        }
        min = sum;
        for(int i = windowSize ; i < n ; i++){
            sum += cardPoints[i] - cardPoints[i - windowSize];
            min = Math.min(min , sum);
        }
        return Arrays.stream(cardPoints).sum() - min;
    }
    public static void main(String[] args) {
        Solution1423 solution1423 = new Solution1423();
        System.out.println(solution1423.maxScore(new int[]{1,2,3,4,5,6,1} , 3));
    }
}
