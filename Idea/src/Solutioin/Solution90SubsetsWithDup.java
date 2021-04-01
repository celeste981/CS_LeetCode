/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution90SubsetsWithDup
 * Author:   CS
 * Date:     2021/3/31 9:21
 * Description: 子集||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈子集||〉
 *
 * @author CS
 * @create 2021/3/31
 * @since 1.0.0
 */
public class Solution90SubsetsWithDup {

    public List<List<Integer>> subsetsWithDup ( int[] nums ) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort( nums );
        int size = nums.length;
        int n = 1 << size;
        for ( int i = 0 ; i < n ; i++ ) {
            List<Integer> temp = new ArrayList<>();
            boolean flag = true;
            for ( int j = 0 ; j < size ; j++ ) {
                //判断数字i的第j位是否为1，为1要取数
                if ( ((i >> j ) & 1) == 1 ) {
                    //判断是否重复出现，不重复取数
                    if ( j > 0 && (i >> (j - 1) & 1 ) == 0 && nums[j] == nums[j - 1] ) {
                        flag = false;
                        continue;
                    }
                    temp.add(nums[j]);
                }
            }
            if ( flag ) {
                ans.add( temp );
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution90SubsetsWithDup solution90SubsetsWithDup = new Solution90SubsetsWithDup();
        System.out.println( solution90SubsetsWithDup.subsetsWithDup( new int[]{1,2,3}) );
    }
}
