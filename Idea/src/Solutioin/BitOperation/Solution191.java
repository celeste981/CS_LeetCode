/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution191
 * Author:   Administrator
 * Date:     2021/3/3 9:26
 * Description: 位1的个数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BitOperation;


/**
 * 〈一句话功能简述〉<br> 
 * 〈位1的个数〉
 *
 * @author Administrator
 * @create 2021/3/3
 * @since 1.0.0
 */
public class Solution191 {

//    public int hammingWeight(int n) {
//        int ans = 0;
//        while(n != 0) {
//            ans += n & 1;
//            n = n >> 1;
//        }
//        return ans;
//    }

    public int hammingWeight(int n) {
        int ans = 0;
        while(n != 0) {
            ans++;
            n &= (n-1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution191 solution191 = new Solution191();
        //00000000000000000000000000001011
        System.out.println(solution191.hammingWeight(00000000000000000000000000001011));
    }
}
