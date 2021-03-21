/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: DailyTemperatures
 * Author:   Administrator
 * Date:     2021/3/19 10:22
 * Description: 每日温度
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈每日温度〉
 *
 * @author Administrator
 * @create 2021/3/19
 * @since 1.0.0
 */
public class DailyTemperatures {
    public int[] dailyTemperatures ( int[] T ) {
        int n = T.length;
        int[] ans = new int[n];
        Deque<Integer> indexStack = new LinkedList<>();
        for ( int i = 0 ; i < n ; i++ ) {
            while ( !indexStack.isEmpty() && T[i] > T[indexStack.peek()] ) {
                ans[indexStack.peek()] = i - indexStack.pop();
            }
            indexStack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        System.out.println(Arrays.toString(dailyTemperatures.dailyTemperatures( new int[] { 73,74,75,71,69,72,76,73 })));
    }
}
