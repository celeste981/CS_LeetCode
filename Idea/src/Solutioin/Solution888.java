/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution888
 * Author:   CS
 * Date:     2021/2/1 21:32
 * Description: 公平的糖果棒交换
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br> 
 * 〈公平的糖果棒交换〉
 *
 * @author CS
 * @create 2021/2/1
 * @since 1.0.0
 */
public class Solution888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] ans = new int[2];
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        Set<Integer> occ = new HashSet<Integer>();
        for(int a : A){
            occ.add(a);
        }
        for(int b : B){
            if(occ.contains( (sumA - sumB + 2*b ) / 2 )){
                ans[0] = (sumA - sumB + 2*b ) / 2;
                ans[1] = b;
                break;
            }
        }
        return ans;
    }

    public int[] fairCandySwap2(int[] A, int[] B){
        int[] ans = new int[2];
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        Arrays.sort(A);
        Arrays.sort(B);
//        Arrays.stream(A).sorted();
//        Arrays.stream(B).sorted();
//        int n1 = A.length;
//        int n2 = B.length;
        for(int i = 0 , j = 0 ; i < A.length && j < B.length ;){
            if((A[i] - B[j]) == (sumA - sumB) / 2){
                ans[0] = A[i];
                ans[1] = B[j];
                break;
            }
            else if((A[i] - B[j]) > (sumA - sumB) / 2){
                j++;
            }
            else if((A[i] - B[j]) < (sumA - sumB) / 2){
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution888 solution888 = new Solution888();
        //输出整型数组要先转String
        // System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(solution888.fairCandySwap2(new int[]{1,1} , new int[]{2,2})));
    }
}
