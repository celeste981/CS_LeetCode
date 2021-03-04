/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution300
 * Author:   Administrator
 * Date:     2021/3/4 9:38
 * Description: 最长递增子序列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br>
 * 〈最长递增子序列〉
 *
 * @author Administrator
 * @create 2021/3/4
 * @since 1.0.0
 */
public class Solution300 {

//    public int lengthOfLIS(int[] nums) {
//        int ans = 1;
//        if (nums.length == 0) {
//            return 0;
//        }
//        int[] dp = new int[nums.length];
//        //Arrays.fill(dp , 1);
//        dp[0] = 1;
//        for (int i = 1 ; i < nums.length ; i++ ) {
//            dp[i] = 1;
//            for (int j = 0 ; j < i ; j++ ) {
//                if ( nums[i] > nums[j]){
//                    dp[i] = Math.max( dp[i] , dp[j]+1 );
//                }
//            }
//            ans = Math.max( ans , dp[i]);
//        }
//        return ans;
//    }

    public int lengthOfLIS(int[] nums) {
        int[] top = new int[nums.length];
        //牌堆数初始化为0
        int piles = 0;
        for (int i = 0 ; i < nums.length ; i++ ) {
            //当前要处理的扑克牌
            int poker = nums[i];

            /*搜索左侧边界的二分查找*/
            int left = 0 , right = piles;
            while(left < right) {
                int mid = left + (right - left) / 2;
                if (poker > top[mid]) {
                    left = mid + 1;
                } else if (poker < top[mid]) {
                    right = mid;
                } else {
                    right = mid;
                }
            }

            //没找到合适的牌堆，新建一堆
            if (left == piles ) {
                piles++;
            }
            //把这张牌放到新建牌堆的堆顶
            top[left] = poker;
        }
        return piles;
    }

    public static void main(String[] args) {
        Solution300 soluiton300 = new Solution300();
        System.out.println(soluiton300.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
