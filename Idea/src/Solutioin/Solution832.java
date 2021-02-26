/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution832
 * Author:   CS
 * Date:     2021/2/24 9:47
 * Description: 翻转图像
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈翻转图像〉
 *
 * @author CS
 * @create 2021/2/24
 * @since 1.0.0
 */
public class Solution832 {

    public int[][] flipAndInvertImage(int[][] A) {
        int[] temp = new int[A[0].length];
        for(int i = 0 ; i < A.length ; i++){
//            for(int j = 0 ; j < A[0].length ; j++){
//                A[i][ 2 - j ] ^= 1;
//                temp[j] = A[i][ 2 - j ];
//            }
//            A[i] = temp;
            int left = 0 , right = A[0].length - 1;
            while (left < right ){
                if(A[i][left] == A[i][right]){
                    A[i][left] ^= 1;
                    A[i][right] ^= 1;
                }
                left++;
                right--;
            }
            if(left == right){
                A[i][left] ^= 1;
            }
            System.out.println(Arrays.toString(A[i]));;
        }
        return A;
    }

    public static void main(String[] args) {
        Solution832 solution832 = new Solution832();
        solution832.flipAndInvertImage(new int[][]{ {1,1,0} , {1,0,1} , {0 , 0 , 0} });
        //System.out.println(Arrays.toString(solution832.flipAndInvertImage(new int[][]{ {1,1,0} , {1,0,1} , {0 , 0 , 0} })));
    }
}
