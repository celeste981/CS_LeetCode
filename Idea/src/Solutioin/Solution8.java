/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution8
 * Author:   CS
 * Date:     2021/2/3 20:38
 * Description: 字符串转换整数 (atoi)：将字符串转换成一个 32 位有符号整数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈字符串转换整数 (atoi)：将字符串转换成一个 32 位有符号整数〉
 *
 * @author CS
 * @create 2021/2/3
 * @since 1.0.0
 */
public class Solution8 {
    public int myAtoi(String s) {
        if(0 == s.length()){
            return 0;
        }
        int ans = 0;
        List<Integer> occ = new ArrayList<Integer>();
        int i = 0;
        while(i < s.length() && ' ' == s.charAt(i)){
            i++;
        }
        int sym = 1;
        if(i >= s.length()){
            return 0;
        }
        else{
            if(s.charAt(i) == '-') sym *= -1;
            else if(s.charAt(i) != '+'){
                if((s.charAt(i) - '0') >= 0 && (s.charAt(i) - '0') <= 9)
                    occ.add(s.charAt(i) - '0');
                else
                    return 0;
            }
            i++;
        }
        while( i < s.length() &&(s.charAt(i) - '0') >= 0 && (s.charAt(i) - '0') <= 9){
            occ.add(s.charAt(i++) - '0');
        }
        while(!occ.isEmpty()){
            if(sym == 1){
                if(ans > Integer.MAX_VALUE / 10 ||
                        (ans == Integer.MAX_VALUE / 10 &&
                                (occ.get(0)) > Integer.MAX_VALUE % 10)){
                    return Integer.MAX_VALUE;
                }
            }
            if(sym == -1){
                if(ans*sym < Integer.MIN_VALUE / 10 ||
                        (ans*sym == Integer.MIN_VALUE / 10 &&
                                (occ.get(0)) > -(Integer.MIN_VALUE % 10))){
                    return Integer.MIN_VALUE;
                }
            }
            ans = ans * 10 + occ.get(0);
            occ.remove(0);
        }

        return ans *= sym;
    }
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.myAtoi("2147483648"));
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        "  -123as dsa"
    }

}
