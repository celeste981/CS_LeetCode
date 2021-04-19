/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution11
 * Author:   CS
 * Date:     2021/2/4 17:25
 * Description: 盛水最多的容器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints.SlidingWindow;

/**
 * 〈一句话功能简述〉<br> 
 * 〈盛水最多的容器〉
 *
 * @author CS
 * @create 2021/2/4
 * @since 1.0.0
 */
public class Solution11 {
    public int maxArea(int[] height) {
        int ans = 0;
        int right = height.length - 1 , left = 0;
        while(left <= right){
            int temp = (right - left) * Math.min(height[left] , height[right]);
            ans = Math.max(ans , temp);
            if(height[left] >= height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        System.out.println(solution11.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
