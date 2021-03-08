/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution448
 * Author:   CS
 * Date:     2021/2/13 13:13
 * Description: 找到所有数组中消失的数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈找到所有数组中消失的数字
 *  找到所有在 [1, n] 范围之间没有出现在数组中的数字〉
 *
 * @author CS
 * @create 2021/2/13
 * @since 1.0.0
 */
public class Solution448 {

    //public List<Integer>

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int n = nums.length;
        for(int num : nums){
            int index = (num - 1) % n;
            nums[index] += n;
        }
        for(int i = 0 ; i < n ; i++){
            if(nums[i] <= n){
                ans.add(i + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution448 solution448 = new Solution448();
        System.out.println(solution448.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
}
