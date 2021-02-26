/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution15
 * Author:   CS
 * Date:     2021/2/4 18:48
 * Description: 三数之和：给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈三数之和：给你一个包含 n 个整数的数组nums，
 * 判断nums中是否存在三个元素 a，b，c ，
 * 使得a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。 〉
 *
 * @author CS
 * @create 2021/2/4
 * @since 1.0.0
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> occ = new ArrayList<>();
        if(nums.length < 3){
            return ans;
        }
        int temp = nums[0] + nums[1] + nums[2];
        if(0 == temp){
            occ.add(nums[0]);
            occ.add(nums[1]);
            occ.add(nums[2]);
            ans.add(new ArrayList<>(occ));
        }
        int right = 3 , left = 0;
        while(right < nums.length){
            temp += nums[right++];
            temp -= nums[left++];
            if(0 == temp){
                occ.add(nums[0]);
                occ.add(nums[1]);
                occ.add(nums[2]);
                ans.add(new ArrayList<>(occ));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        System.out.println(solution15.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
