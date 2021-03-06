/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution88Merge
 * Author:   CS
 * Date:     2021/4/6 10:30
 * Description: 合并两个有序数组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈合并两个有序数组〉
 *
 * @author CS
 * @create 2021/4/6
 * @since 1.0.0
 */
public class Solution88Merge {

//    private void merge ( int[] nums1 , int m , int[] nums2 , int n ) {
//        int i = m - 1 , j = n - 1 , k = m + n - 1;
//        while ( j >= 0 ) {
//            if ( i >= 0 ) {
//                if ( nums2[j] > nums1[i] ) {
//                    nums1[k] = nums2[j--];
//                } else {
//                    nums1[k] = nums1[i--];
//                }
//            } else {
//                nums1[k] = nums2[j--];
//            }
//            k--;
//        }
//    }

    public void merge( int[] nums1 , int m , int[] nums2 , int n ) {
        int i = m - 1 ;
        int j = n - 1 ;
        int k = m + n - 1 ;
        //只要 i < 0          变动，把nums2全复制到nums1中
        //只要 j < 0          不用变动
        //i >= 0 && j >= 0   变动，把较大者放到后面
        while ( j >= 0 ) {
            if (i < 0 || nums2[j] >= nums1[i] ) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }
    }

    public static void main(String[] args) {
        Solution88Merge solution88Merge = new Solution88Merge();
        int[] nums1 = new int[]{ 0 };
        int m = 0;
        int[] nums2 = new int[]{ 1 };
        int n = 1;
        //{1,2,3,0,0,0} 3 , {2,5,6} 3
        //{0} 0 , {1} 1
        solution88Merge.merge(nums1 , m , nums2 , n);
        System.out.println(Arrays.toString(nums1));
    }
}
