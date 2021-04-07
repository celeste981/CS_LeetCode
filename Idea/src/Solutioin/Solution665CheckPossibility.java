/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution665
 * Author:   CS
 * Date:     2021/2/7 14:13
 * Description: 非递减数列：给你一个长度为 n 的整数数组，请你判断在 最多 改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;


/**
 * 〈一句话功能简述〉<br> 
 * 〈非递减数列：给你一个长度为 n 的整数数组，
 * 请你判断在 最多 改变 1 个元素的情况下，
 * 该数组能否变成一个非递减数列。〉
 *
 * @author CS
 * @create 2021/2/7
 * @since 1.0.0
 */
public class Solution665CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        boolean ans = true;
        int n = nums.length, count = 0;
        for (int i = 0; i < n - 1; i++) {
            if(nums[i+1] < nums[i]){
                if(count >= 1){
                    ans = false;
                    return ans;
                }
                count++;
                if(i > 0 && nums[i+1] < nums[i-1]){
                    nums[i+1] = nums[i];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution665CheckPossibility solution665 = new Solution665CheckPossibility();
        System.out.println(solution665.checkPossibility(new int[]{3 , 5 , 3}));
    }
}
