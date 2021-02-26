/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Array1
 * Author:   CS
 * Date:     2021/2/11 16:23
 * Description: 删除排序数组中的重复项
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package PrimaryAlgorithm.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br> 
 * 〈删除排序数组中的重复项〉
 *
 * @author CS
 * @create 2021/2/11
 * @since 1.0.0
 */
public class Array1 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)    return 0;
        int i = 0 , j = 1;
        while (j < nums.length){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i;
    }
    public static void main(String[] args) {
        Array1 array1 = new Array1();
        int[] nums = new int[]{ 0 , 0 , 1 , 1 , 1 , 2 , 2 , 3 , 3 , 4 };
        System.out.println(array1.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
