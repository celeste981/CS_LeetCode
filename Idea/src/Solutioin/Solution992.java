/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution992
 * Author:   CS
 * Date:     2021/2/9 0:14
 * Description: K个不同整数的子数组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import Solutioin.DynamicProgramming.Solution978;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Handler;

/**
 * 〈一句话功能简述〉<br> 
 * 〈K个不同整数的子数组〉
 *
 * @author CS
 * @create 2021/2/9
 * @since 1.0.0
 */
public class Solution992 {

    public int atMostKDistinct(int[] A, int K) {
        int ans = 0;
        int n = A.length;
        int[] occ = new int[n+1];
        int right = 0 , left = 0;
        int count = 0;
        while(right < n){
            if(occ[A[right]] == 0){
                count++;
            }
            occ[A[right]]++;
            right++;

            while(count > K){
                occ[A[left]]--;
                if(occ[A[left]] == 0){
                    count--;
                }
                left++;
            }
            ans += right - left;
        }
        return ans;
    }

    public int subarraysWithKDistinct(int[] A, int K) {

        //return atMostKDistinct(A , K) - atMostKDistinct(A , K-1);

        int ans = 0;
        int n = A.length , right = 0 , left = 0 , min = 0;
        Set<Integer> occ = new HashSet<Integer>();
        while(right < n){
            boolean cur = occ.add(A[right++]);
            if (occ.size() == K && cur){
                min = right - 1;
            }
            if(occ.size() == K && right == n){
                ans += right - min;
                left++;
                right = left;
                min = left;
                occ.clear();
            }
            if(occ.size() > K){
                ans += right - min - 1;
                left++;
                right = left;
                min = left;
                occ.clear();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution992 solution992 = new Solution992();
        System.out.println(solution992.subarraysWithKDistinct(new int[]{1,2,1,2,1} , 2));
    }
}
