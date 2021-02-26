/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution978
 * Author:   CS
 * Date:     2021/2/8 16:28
 * Description: 最长湍流子数组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最长湍流子数组〉
 *
 * @author CS
 * @create 2021/2/8
 * @since 1.0.0
 */
public class Solution978 {
    public int maxTurbulenceSize(int[] arr) {
        int ans = 1;
        int n = arr.length;
        if(n < 2){
            return ans;
        }
        int[] up = new int[n];
        int[] down = new int[n];
        up[0] = 1;  down[0] = 1;
        for(int i = 1 ; i < n ; i++){
            if(arr[i - 1] < arr[i]){
                down[i] = up[i - 1] + 1;
                up[i] = 1;
            }
            else if(arr[i - 1] > arr[i]){
                up[i] = down[i - 1] + 1;
                down[i] = 1;
            }
            else{
                up[i] = 1;
                down[i] = 1;
            }
            ans = Math.max( ans , Math.max( up[i] , down[i] ) );
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution978 solution978 = new Solution978();
        //System.out.println(solution978.maxTurbulenceSize(new int[]{}));
    }
}
