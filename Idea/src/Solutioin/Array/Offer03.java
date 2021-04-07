/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer03
 * Author:   CS
 * Date:     2021/3/7 15:44
 * Description: 剑指 Offer 03.数组中重复的数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Array;

/**
 * 〈一句话功能简述〉<br> 
 * 〈剑指 Offer 03.数组中重复的数字〉
 *
 * @author CS
 * @create 2021/3/7
 * @since 1.0.0
 */
public class Offer03 {

    public int findRepeatNumber(int[] nums) {
        for (int i = 0 ; i < nums.length ; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Offer03 offer03 = new Offer03();
        System.out.println(offer03.findRepeatNumber(new int[]{2,3,1,0,2,5,3}));
    }
}
