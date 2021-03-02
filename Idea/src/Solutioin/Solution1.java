/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1
 * Author:   Administrator
 * Date:     2021/3/2 16:13
 * Description: 两数之和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈两数之和〉
 *
 * @author Administrator
 * @create 2021/3/2
 * @since 1.0.0
 */
public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer> occ = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++ ) {
            if (occ.containsKey(target - nums[i])) {
                return new int[]{occ.get(target - nums[i]) , i};
            } else {
                occ.put(nums[i] , i);
            }
        }
        //default
        return new int[0];
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(Arrays.toString(solution1.twoSum(new int[]{2,7,11,15} , 9)));

    }
}
