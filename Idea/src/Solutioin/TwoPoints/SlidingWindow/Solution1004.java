/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1004
 * Author:   CS
 * Date:     2021/2/2 17:51
 * Description: 最大连续1的个数 III：给定一个由若干 0 和 1 组成的数组 A，我们最多可以将 K 个值从 0 变成 1 。  返回仅包含 1 的最长（连续）子数组的长度。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints.SlidingWindow;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最大连续1的个数 III：给定一个由若干 0 和 1 组成的数组 A，
 * 我们最多可以将 K 个值从 0 变成 1 。
 * 返回仅包含 1 的最长（连续）子数组的长度。〉
 *
 * @author CS
 * @create 2021/2/2
 * @since 1.0.0
 */
public class Solution1004 {
    public int longestOnes(int[] A, int K) {
        int ans;
        int n = A.length , right = 0 , left = 0 , max = 0 , sum = 0;
        while(right < n){
            sum += A[right++];
            max = Math.max(max , sum);
            if((right - left) > max + K){
                sum -= A[left++];
            }
        }
        ans = right - left;
        return ans;
    }
    public static void main(String[] args) {
        Solution1004 solution1004 = new Solution1004();
        System.out.println(solution1004.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0} , 2));
    }
}
