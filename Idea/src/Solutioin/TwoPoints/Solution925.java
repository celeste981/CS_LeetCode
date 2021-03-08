/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution925
 * Author:   Administrator
 * Date:     2021/3/4 14:45
 * Description: 长按键入
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints;

/**
 * 〈一句话功能简述〉<br> 
 * 〈长按键入〉
 *
 * @author Administrator
 * @create 2021/3/4
 * @since 1.0.0
 */
public class Solution925 {

    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        for ( ; i < name.length() && j < typed.length() ; ) {
            if(typed.charAt(j) == name.charAt(i)){
                i++;
                j++;
            } else if (i > 0 && typed.charAt(j) == name.charAt(i - 1)) {
                j++;
            } else {
                return false;
            }
        }
        while (j < typed.length() ){
            if (typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
            j++;
        }
        return i == name.length();
    }

    public static void main(String[] args) {
        Solution925 solution925 = new Solution925();
        System.out.println(solution925.isLongPressedName("alexd" , "ale"));
    }
}
