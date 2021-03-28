/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution88Merge
 * Author:   CS
 * Date:     2021/3/26 10:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Array;

/**
 * 〈一句话功能简述〉<br> 
 * 〈合并两个有序数组〉
 *
 * @author CS
 * @create 2021/3/26
 * @since 1.0.0
 */
public class Solution88Merge {

    public void merge ( int[] nums1 , int m , int[] nums2 , int n ) {
        if ( n == 0 ) {
            return ;
        }
        int i = m - 1 ;
        int j = n - 1 ;
        int k = m + n - 1;
        while ( j >= 0 ) {
            //每次选出较大者放在最后
            if ( i >= 0 && nums1[i] > nums2[j] ) {
                nums1[ k] = nums2[i];
                i--;
            } else {
                nums1[ k ] = nums1[j];
                j--;
            }
            k--;
        }
//        //nums2中的元素不一定全存在了nums1中
//        while ( j >= 0) {
//            nums1[k--] = nums2[j--];
//        }
    }

    public static void main(String[] args) {
        Solution88Merge solution88Merge = new Solution88Merge();
//        solution88Merge.merge( new int[]{ 1,2,3,0,0,0} ,3 ,new int[]{2,5,6} , 3);
        solution88Merge.merge( new int[]{ 0 } ,0 ,new int[]{ 1 } , 1);
    }
}
