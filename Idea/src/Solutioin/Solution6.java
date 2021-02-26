/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution6
 * Author:   CS
 * Date:     2021/1/31 15:36
 * Description: 6.Z字形变换
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈6.Z字形变换〉
 *
 * @author CS
 * @create 2021/1/31
 * @since 1.0.0
 */
public class Solution6 {

    String convert(String s, int numRows){
        if(numRows == 1 ){
            return s;
        }
        int n = s.length();
        char[][] occ = new char[numRows][n];
        //设置flag，flag = 1 ， 向下 ，flag = 2 ，斜着
        int flag = 1 , count = 1 , i = 1 , j = 0 , temp = numRows - 1;
        occ[0][0] = s.charAt(0);
        while(count < n){
            occ[i][j] = s.charAt(count++);
            temp--;
            if(0 == temp){
                temp = numRows - 1;
                flag *= -1;
            }
            if(flag == 1){
                i++;
            }
            if(flag == -1){
                i--;
                j++;
            }
        }
        StringBuilder builder = new StringBuilder();
        for(i = 0 ; i < numRows ; i++){
            for(j = 0 ; j < n ; j++){
                if(occ[i][j] != 0){
                    builder.append(occ[i][j]);
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        System.out.println(solution.convert("PAYPALISHIRING" , 4));
    }
}
