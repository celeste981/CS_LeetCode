/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution338
 * Author:   Administrator
 * Date:     2021/3/3 10:12
 * Description: 比特位计数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;


import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈比特位计数〉
 *
 * @author Administrator
 * @create 2021/3/3
 * @since 1.0.0
 */
public class Solution338 {

//    public int[] countBits(int num) {
//        int[] ans = new int[num + 1];
//        int highBit = 0;
//        for (int i = 1 ; i < num + 1 ; i++ ) {
//            if( ( i & (i - 1) ) == 0 ) {
//                highBit = i;
//            }
//            ans[i] = ans[i - highBit] + 1;
//        }
//        return ans;
//    }

//    public int[] countBits(int num) {
//        int[] ans = new int[num + 1];
//        for (int i = 1 ; i < num + 1 ; i++ ) {
//            ans[i] = ans[i >> 1] + (i & 1);
//        }
//        return ans;
//    }

    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        for (int i = 1 ; i < num + 1 ; i++ ) {
            ans[i] = ans[i & (i - 1)] + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution338 solution338 = new Solution338();
        System.out.println(Arrays.toString(solution338.countBits(5)));
    }
}
