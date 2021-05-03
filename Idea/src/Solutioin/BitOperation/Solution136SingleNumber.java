/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution136SingleNumber
 * Author:   CS
 * Date:     2021/4/30 9:26
 * Description: 只出现一次的数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BitOperation;

/**
 * 〈一句话功能简述〉<br> 
 * 〈只出现一次的数字〉
 *
 * @author CS
 * @create 2021/4/30
 * @since 1.0.0
 */
public class Solution136SingleNumber {

    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {

    }
}
