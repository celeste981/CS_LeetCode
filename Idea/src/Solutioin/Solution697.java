/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution697
 * Author:   CS
 * Date:     2021/2/20 9:04
 * Description: 数组的度
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈数组的度〉
 *
 * @author CS
 * @create 2021/2/20
 * @since 1.0.0
 */
public class Solution697 {
    public int findShortestSubArray(int[] nums) {
        int ans = 0;
        Map< Integer , int[] > occ = new HashMap< Integer , int[] >();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(occ.containsKey(nums[i])){
                occ.get(nums[i])[0]++;
                occ.get(nums[i])[2] = i;
            }
            else{
                occ.put(nums[i] , new int[]{ 1 , i , i });
            }
        }
        int maxNum = 0, minLen = 0;
        for (Map.Entry<Integer, int[]> entry : occ.entrySet()) {
            int[] arr = entry.getValue();
            if (maxNum < arr[0]) {
                maxNum = arr[0];
                minLen = arr[2] - arr[1] + 1;
            } else if (maxNum == arr[0]) {
                if (minLen > arr[2] - arr[1] + 1) {
                    minLen = arr[2] - arr[1] + 1;
                }
            }
        }
        return ans = minLen;
    }

    public static void main(String[] args) {
        Solution697 solution697 = new Solution697();
        System.out.println(solution697.findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
    }

}
