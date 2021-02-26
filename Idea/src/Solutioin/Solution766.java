/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution766
 * Author:   CS
 * Date:     2021/2/22 21:19
 * Description: 托普利茨矩阵：
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈托普利茨矩阵：〉
 *
 * @author CS
 * @create 2021/2/22
 * @since 1.0.0
 */
public class Solution766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean ans = true;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 1 ; i < m ; i++ ){
            for(int j = 1 ; j < n ; j++){
                if(matrix[i][j] != matrix[i - 1][j - 1]){
                    return !ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution766 solution766 = new Solution766();
        System.out.println(solution766.isToeplitzMatrix(new int[][]{{1,2,3,4} , {5,1,2,3} , {9,5,1,2}}));
    }

}
