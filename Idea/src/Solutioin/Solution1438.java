/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1438
 * Author:   CS
 * Date:     2021/2/24 15:40
 * Description: 绝对差不超过限制的最长连续子数组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Deque;
import java.util.LinkedList;
import java.util.TreeMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈绝对差不超过限制的最长连续子数组〉
 *
 * @author CS
 * @create 2021/2/24
 * @since 1.0.0
 */
public class Solution1438 {

    public int longestSubarray(int[] nums, int limit) {
        int ans = 1;
        int left = 0 , right = 0;
        TreeMap<Integer , Integer> occ = new TreeMap<>();
        while(right < nums.length){
            occ.put(nums[right] , occ.getOrDefault(nums[right] , 0) + 1);
            while(occ.lastKey() - occ.firstKey() > limit) {
                occ.put(nums[left] , occ.get(nums[left]) - 1);
                if(0 == occ.get(nums[left])){
                    occ.remove(nums[left]);
                }
                left++;
            }
            ans = Math.max(ans , right + 1 - left);
            right++;
        }
        return ans;
    }

    public int longestSubarray2(int[] nums, int limit) {
        int ans = 1;
        Deque<Integer> queMax = new LinkedList<Integer>();
        Deque<Integer> queMin = new LinkedList<Integer>();
        int left = 0 , right = 0;
        while(right < nums.length) {
            while(!queMax.isEmpty() && queMax.peekLast() < nums[right]){
                queMax.pollLast();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution1438 solution1438 = new Solution1438();
        System.out.println(solution1438.longestSubarray(new int[]{10,1,2,4,7,2} , 5));
    }
}
