/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution15
 * Author:   Administrator
 * Date:     2021/3/2 16:01
 * Description: 三数之和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import Solutioin.BinarySearch.SolutionLCP12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br> 
 * 〈三数之和〉
 *
 * @author Administrator
 * @create 2021/3/2
 * @since 1.0.0
 */
public class Solution15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        //List<Set<Integer>> ans2 = new ArrayList<>();
        if (nums.length < 3) {
            return ans;
        }
        Arrays.sort(nums);
        List<Integer> occ ;
        for (int i = 0 ; i < nums.length ; i++ ) {
            if(nums[i] > 0) {
                return ans;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
               continue;
            }
            int left = i + 1;
            int right = i + 2;
            while (right < nums.length) {
                int temp = (-1) * (nums[left] + nums[i]);
                if (nums[right] == temp){
                    occ = new ArrayList<>(Arrays.asList(nums[i] , nums[left] , nums[right]));
                    ans.add(occ);
                    System.out.println(occ);
                    left++;
                    while(left < nums.length - 1 && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    right = left + 1;
                } else if (nums[right] > temp) {
                    left++;
                    while(left < nums.length - 1 && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    right = left + 1;
                } else {
                    right++;
                    if (right == nums.length && left != nums.length - 2) {
                        left++;
                        while(left < nums.length - 1 && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        right = left + 1;
                    }
                }
            }


        }
        return ans;
    }




    /*
    * int left = i + 1;
            int right = nums.length - 1;
            int temp = nums[i] * (-1);
            while(left < right){
                if(temp == nums[left] + nums[right]) {
                    occ = new ArrayList<>(Arrays.asList(nums[i] , nums[left] , nums[right]));
                    System.out.println(occ);
                    ans.add(occ);
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else if (temp > nums[left] + nums[right]) {
                    left++;
                } else {
                    right--;
                }
            }*/

    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        solution15.threeSum(new int[]{-1,0,1,2,-1,-4});
    }
}
