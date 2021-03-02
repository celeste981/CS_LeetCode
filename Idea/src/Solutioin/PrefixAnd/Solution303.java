/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution303
 * Author:   Administrator
 * Date:     2021/3/1 9:05
 * Description: 区域和检索-数组不可变
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.PrefixAnd;

/**
 * 〈一句话功能简述〉<br> 
 * 〈区域和检索-数组不可变〉
 *
 * @author Administrator
 * @create 2021/3/1
 * @since 1.0.0
 */
public class Solution303 {

    int[] sums;

    public Solution303(int[] nums) {
        int n = nums.length;
        sums = new int[n + 1];
        for (int i = 0 ; i < n ; i++ ) {
            sums[i + 1] = nums[i] + sums[i];
        }
    }

    public int sumRange(int i, int j) {
        return  sums[j + 1] - sums[i];
    }

    public static void main(String[] args) {
        Solution303 solution303 = new Solution303(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(solution303.sumRange(0,1));
    }
}
