/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution7Reverse
 * Author:   CS
 * Date:     2021/5/3 8:11
 * Description: 整数反转
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈整数反转〉
 *
 * @author CS
 * @create 2021/5/3
 * @since 1.0.0
 */
public class Solution7Reverse {

    public int reverse(int x) {
        long ans = 0;
        while (x != 0) {
            int tmp = x % 10;
            ans = ans * 10 + tmp;
            x /= 10;
        }
        if ((int)ans != ans) {
            return 0;
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        Solution7Reverse solution7Reverse = new Solution7Reverse();
        System.out.println(solution7Reverse.reverse(-123));
    }
}
