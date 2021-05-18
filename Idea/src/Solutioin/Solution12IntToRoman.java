/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution12IntToRoman
 * Author:   CS
 * Date:     2021/5/14 9:28
 * Description: 整数转罗马数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈整数转罗马数字〉
 *
 * @author CS
 * @create 2021/5/14
 * @since 1.0.0
 */
public class Solution12IntToRoman {

    private int[] A = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private String[] B = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1,"I");
//        map.put(4,"IV");
//        map.put(5,"V");
//        map.put(9,"IX");
//        map.put(10,"X");
//        map.put(40,"XL");
//        map.put(50,"L");
//        map.put(90,"XC");
//        map.put(100,"C");
//        map.put(400,"CD");
//        map.put(500,"D");
//        map.put(900,"CM");
//        map.put(1000,"M");
        for (int i = A.length - 1; i >= 0; i--) {
            while (num >= A[i]) {
                sb.append(B[i]);
                num -= A[i];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution12IntToRoman solution12IntToRoman = new Solution12IntToRoman();
        System.out.println(solution12IntToRoman.intToRoman(3));
    }
}
