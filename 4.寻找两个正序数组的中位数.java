/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。

进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
 * 
 */

// @lc code=start

//1.合并数组，计算总长度，根据总长度是奇数还是偶数返回中位数
// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int[] nums;
//         int m = nums1.length;
//         int n = nums2.length;
//         //如果任意一个数组长度为0，直接返回中位数
//         if(m == 0){
//             if(n % 2 == 0){
//                 return (nums2[n/2] + nums2[n/2 - 1]) / 2.0;
//             }
//             else{
//                 return nums2[n/2] * 1.0;
//             }
//         }
//         if(n == 0){
//             if(m % 2 == 0){
//                 return (nums1[m/2] + nums1[m/2 - 1]) / 2.0;
//             }
//             else{
//                 return nums1[m/2] * 1.0;
//             }
//         }
//         //为合并数组开辟空间,直接把两个数组填进nums中，再排序取中位数
//         nums = new int[m + n];
//         int index = 0;
//         int i = 0 , j = 0;
//         while(index != (m + n)){
//             while(i != m){
//                 nums[index++] = nums1[i++];
//             }
//             while(j != n){
//                 nums[index++] = nums2[j++];
//             }
//         }
//         Arrays.sort(nums);
//         // if((m + n) % 2 == 0){
//         //     return (nums[(m + n) / 2 -1] + nums[(m + n) / 2]) / 2.0;
//         // }
//         // else{
//         //     return nums[(m + n) / 2] / 1.0;
//         // }
//         //中位数输出小技巧
//         /*
//             不用判断奇偶数来输出
//             设总长度为len，则下标为(len / 2) 和 (（len - 1）/ 2)
//         */
//         return((nums[(n + m) / 2] + nums[(n + m - 1) / 2]) / 2.0);

//     }
// }

//1.略微优化后的版本
// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int len1 = nums1.length;
//         int len2 = nums2.length;
//         int len = len1 + len2;
//         int index = 0 , i = 0 , j = 0;
//         int[] nums = new int[len];
//         while(index != len){
//             while(i != len1){
//                 nums[index++] = nums1[i++];
//             }
//             while(j != len2){
//                 nums[index++] = nums2[j++];
//             }
//         }
//         Arrays.sort(nums);
//         return  ( nums[len / 2] + nums[(len - 1) / 2] ) / 2.0;
//     }
// }

//2.寻找中位数下标
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int len = m + n;
        int s1 = 0,  s2 = 0 , right = 0 , left = 0 , i = 0;
        if(m == 0){
            return  ( nums2[n / 2] + nums2[(n - 1) / 2] ) / 2.0;
        }
        if(n == 0){
            return  ( nums1[m / 2] + nums1[(m - 1) / 2] ) / 2.0;
        }
        //遍历 len/2 次找到中位数
        for(i = 0 ; i <= len/2 ; i++){
            //利用left保存上一次更新的right
            //每次的更新值赋给right
            left = right;
            // if(s1 < m && (nums1[s1] <= nums2[s2] || s2 > n)){
            //     right = nums1[s1++];
            // }
            // else{
            //     right = nums2[s2++];
            // }
            
            if(s1  < m && s2 < n){
                if(nums1[s1] <= nums2[s2]){
                    right = nums1[s1++];
                }
                else{
                    right = nums2[s2++];
                }
            }
            else if(s1 == m){
                right = nums2[s2++];
            }
            else{
                right = nums1[s1++];
            }
        }
        if((len & 1) == 0){
            return (right + left) * 0.5;
        }
        else{
            return right;
        }
    }
}



// @lc code=end

