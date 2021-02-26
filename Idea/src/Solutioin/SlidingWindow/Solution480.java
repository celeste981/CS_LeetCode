/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution480
 * Author:   CS
 * Date:     2021/2/3 11:04
 * Description: 滑动窗口中位数：中位数是有序序列最中间的那个数。如果序列的大小是偶数，则没有最中间的数；此时中位数是最中间的两个数的平均数。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.SlidingWindow;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈滑动窗口中位数：中位数是有序序列最中间的那个数。如果序列的大小是偶数，则没有最中间的数；此时中位数是最中间的两个数的平均数。〉
 *
 * @author CS
 * @create 2021/2/3
 * @since 1.0.0
 */
public class Solution480 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] ans = new double[nums.length + 1 - k];
        int[] occ = new int[k];
        int index = 0;
        occ = Arrays.copyOf(nums , k);
        Arrays.sort(occ);
        System.out.println(Arrays.toString(occ));
        System.out.println((occ[k/2]*0.5 + occ[(k-1)/2]*0.5));
        ans[index++] = occ[k/2] * 0.5 + occ[(k-1)/2] * 0.5;
        int right = k , left = 0;
        while(right < nums.length){
            int tempIndex = biSearch(occ , nums[right - k]);
            insertAndSort(occ , nums[right] , tempIndex);
            right++;
            ans[index++] = occ[k/2] * 0.5 + occ[(k-1)/2] * 0.5;
        }
        return ans;
    }


    public void insertAndSort(int[] arr , int x , int index) {
        if(x == arr[index]){
            arr[index] = x;
        }
        //往index后找插入位置  数组前移
        else if(x > arr[index]){
            int i = index + 1;
            while(i < arr.length && x > arr[i]){
                arr[i - 1] = arr[i++];
            }
            arr[i - 1] = x;
        }
        //往index前面插入  数组后移
        else if(x < arr[index]){
            int i = index - 1;
            while(i >= 0 && x < arr[i]){
                arr[i + 1] = arr[i--];
            }
            arr[i + 1] = x;
        }
    }

    public int biSearch(int[] arr , int x){
        int left = 0 , right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(x == arr[mid])   return mid;
            else if(x > arr[mid])   left = mid + 1;
            else    right = mid - 1;
        }
        //未找到返回-1
        return -1;
    }
    public static void main(String[] args) {
        Solution480 solution480 = new Solution480();
        System.out.println(Arrays.toString((solution480.medianSlidingWindow(new int[]{2147483647,2147483647} , 2))));
    }
}
