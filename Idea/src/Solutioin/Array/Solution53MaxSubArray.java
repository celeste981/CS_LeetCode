/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution53MaxSubArray
 * Author:   CS
 * Date:     2021/3/26 9:37
 * Description: 最大子序和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Array;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最大子序和〉
 *
 * @author CS
 * @create 2021/3/26
 * @since 1.0.0
 */
public class Solution53MaxSubArray {

    public int maxSubArray ( int[] nums ) {
        int ans = nums[0];
        int curSum = 0;
        for ( int x : nums ) {
            curSum  = curSum < 0 ? x : curSum + x;
            ans = Math.max( ans , curSum );
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution53MaxSubArray solution53MaxSubArray = new Solution53MaxSubArray();
        System.out.println( solution53MaxSubArray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }
}
