/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution338
 * Author:   Administrator
 * Date:     2021/3/3 9:20
 * Description: 比特位计数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BitOperation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈比特位计数〉
 *
 * @author Administrator
 * @create 2021/3/3
 * @since 1.0.0
 */
public class Solution338 {

    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        for ( int i = 1 ; i < num+1 ; i++ ) {
            int x = i;
            while(x != 0) {
                ans[i]++;
                x &= (x-1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution338 solution338 = new Solution338();
        System.out.println(Arrays.toString(solution338.countBits(5)));
    }
}
