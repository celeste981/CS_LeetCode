/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer63LastRemaining
 * Author:   CS
 * Date:     2021/5/12 22:32
 * Description: 圆圈中最后剩下的数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈圆圈中最后剩下的数字〉
 *
 * @author CS
 * @create 2021/5/12
 * @since 1.0.0
 */
public class Offer63LastRemaining {

    public int lastRemaining(int n, int m) {
        int f = 0;
        for (int i = 2; i != n + 1; ++i) {
            f = (m + f) % i;
        }
        return f;
    }

    public static void main(String[] args) {

    }
}
