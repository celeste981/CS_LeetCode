/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1224MaxEqualFreq
 * Author:   CS
 * Date:     2021/3/28 21:27
 * Description: 最大相等频率
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最大相等频率〉
 *
 * @author CS
 * @create 2021/3/28
 * @since 1.0.0
 */
public class Solution1224MaxEqualFreq {
    public int maxEqualFreq ( int[] nums ) {
        int ans = 0;
        //sub数组：数字i出现了j次    数字的频次
        int []sub = new int[100001];
        //pre数组：频数为i的有j种    频次的频次
        int []pre = new int[100001];
        //当前频数最高的数字
        int cur = 0;
        for (int i = 0 ; i < nums.length ; i++ ) {
            pre[ ++sub[nums[i]] ]++;
            cur = Math.max( sub[nums[i]] , cur );
            if( pre[cur]==1 && pre[cur-1] * (cur-1)+1 == (i+1) || (pre[cur]*cur+1==i+1)){
                ans=i+1;
            }
        }
        if(cur == 1) return nums.length;
        return ans;
    }

    public static void main(String[] args) {
        Solution1224MaxEqualFreq solution1224MaxEqualFreq = new Solution1224MaxEqualFreq();
        System.out.println( solution1224MaxEqualFreq.maxEqualFreq(new int[] { 2,2,1,1,5,3,3,5}));
    }

}
