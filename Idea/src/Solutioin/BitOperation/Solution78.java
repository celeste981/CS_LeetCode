/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution78
 * Author:   CS
 * Date:     2021/2/26 21:02
 * Description: 子集
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BitOperation;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈子集〉
 *
 * @author CS
 * @create 2021/2/26
 * @since 1.0.0
 */
public class Solution78 {

    //子集真值表
    // 位掩法
    public List<List<Integer>> subsets(int[] nums) {
        //真值表大小
        int size = nums.length;
        int n = 1 << size;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++ ) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0 ; j < size ; j++ ) {
                if( ( ( i >> j ) & 1 ) == 1) {
                    temp.add(nums[j]);
                }
            }
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution78 solution78 = new Solution78();
        System.out.println(solution78.subsets(new int[]{1,2,3}));
    }
}
