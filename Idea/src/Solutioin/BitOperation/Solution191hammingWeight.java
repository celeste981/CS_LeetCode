/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution191hammingWeight
 * Author:   CS
 * Date:     2021/3/22 8:47
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
 * @author CS
 * @create 2021/3/22
 * @since 1.0.0
 */
public class Solution191hammingWeight {

    public int hammingWeight(int n) {
        int ans = 0;
        while ( n != 0 ) {
            n &= (n - 1);
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution191hammingWeight solution191hammingWeight = new Solution191hammingWeight();

    }
}
