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
package Solutioin.BinarySearch;


/**
 * 〈一句话功能简述〉<br> 
 * 〈分割数组的最大值〉
 *
 * @author CS
 * @create 2021/2/28
 * @since 1.0.0
 */
public class Solution410SplitArray {

    public int splitArray(int[] nums, int m) {
        int left = 0 , right = 0;
        //二分查找右边界是数组元素和
        //二分查找左边界是最大数组元素
        for (int i = 0 ; i < nums.length ; i++ ) {
            right += nums[i];
            if (left < nums[i]) {
                left = nums[i];
            }
        }
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if(check(nums , mid , m)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
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
        Solution410SplitArray solution410 = new Solution410SplitArray();
        System.out.println(solution410.splitArray(new int[]{1,7,2,8,5} , 3));
    }
}
