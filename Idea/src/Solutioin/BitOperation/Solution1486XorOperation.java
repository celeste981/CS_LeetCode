/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1486XorOperation
 * Author:   CS
 * Date:     2021/5/7 9:17
 * Description: 数组异或操作
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BitOperation;

/**
 * 〈一句话功能简述〉<br> 
 * 〈数组异或操作〉
 *
 * @author CS
 * @create 2021/5/7
 * @since 1.0.0
 */
public class Solution1486XorOperation {

    public int xorOperation(int n, int start) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= (start + i * 2);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
