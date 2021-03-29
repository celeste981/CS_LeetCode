/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution190ReverseBits
 * Author:   CS
 * Date:     2021/3/29 8:27
 * Description: 颠倒二进制位
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈颠倒二进制位〉
 *
 * @author CS
 * @create 2021/3/29
 * @since 1.0.0
 */
public class Solution190ReverseBits {

    public int reverseBits ( int n ) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }

    public static void main(String[] args) {
        Solution190ReverseBits solution190ReverseBits = new Solution190ReverseBits();
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(43261596));
        System.out.println(Integer.toBinaryString(solution190ReverseBits.reverseBits( 43261596 )));
    }
}
