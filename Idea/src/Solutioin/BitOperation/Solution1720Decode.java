/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1720Decode
 * Author:   CS
 * Date:     2021/5/6 9:01
 * Description: 解码异或后的数组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BitOperation;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈解码异或后的数组〉
 *
 * @author CS
 * @create 2021/5/6
 * @since 1.0.0
 */
public class Solution1720Decode {

    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] decode = new int[++n];
        decode[0] = first;
        for (int i = 1; i < n; i++) {
            decode[i] = encoded[i - 1] ^ decode[i - 1];
        }
        return decode;
    }

    public static void main(String[] args) {
        Solution1720Decode solution1720Decode = new Solution1720Decode();
        // 1,2,3    1
        // 6,2,7,3  4
        // 6    1
        int[] encoded = new int[]{6};
        System.out.println(Arrays.toString(solution1720Decode.decode(encoded, 1)));
    }
}
