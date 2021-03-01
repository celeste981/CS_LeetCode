/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution410
 * Author:   CS
 * Date:     2021/2/28 23:24
 * Description: 分割数组的最大值
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;


/**
 * 〈一句话功能简述〉<br> 
 * 〈分割数组的最大值〉
 *
 * @author CS
 * @create 2021/2/28
 * @since 1.0.0
 */
public class Solution410 {

    public int splitArray(int[] nums, int m) {
        int ans = 0;
        return ans;
    }

    public boolean check(int[] nums , int x , int m) {
        int sum = 0;
        int cnt = 1;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > x) {
                cnt++;
                sum = nums[i];
            } else {
                sum += nums[i];
            }
        }
        return cnt <= m;
    }

    public static void main(String[] args) {
        Solution410 solution410 = new Solution410();
        System.out.println(solution410.splitArray(new int[]{7,2,5,10,8} , 2));
    }
}
