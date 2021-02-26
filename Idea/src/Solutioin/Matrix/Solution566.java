/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution566
 * Author:   CS
 * Date:     2021/2/17 14:07
 * Description: 重塑矩阵
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Matrix;

/**
 * 〈一句话功能简述〉<br> 
 * 〈重塑矩阵〉
 *
 * @author CS
 * @create 2021/2/17
 * @since 1.0.0
 */
public class Solution566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length * nums[0].length != r * c){
            return nums;
        }
        int[][] ans = new int[r][c];
        for(int count = 0 ; count < r * c ; count++){
            ans[count / c][count % c] = nums[count / nums[0].length][count % nums[0].length];
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution566 solution566 = new Solution566();
        //System.out.println();
    }
}
