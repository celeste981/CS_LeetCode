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
public class Solution78Subsets {

    //子集真值表
    // 位掩法
    public List<List<Integer>> subsets(int[] nums) {
        int size = nums.length;
        //求真值表大小
        int n = 1 << size;      //2^n
        List<List<Integer>> ans = new ArrayList<>();
        //遍历整个真值表
        for(int i = 0 ; i < n ; i++ ) {
            //每次重新new temp
            List<Integer> temp = new ArrayList<>();
            for (int j = 0 ; j < size ; j++ ) {
                //数字i的第j位为1
                if( ( ( i >> j ) & 1 ) == 1) {
                    temp.add(nums[j]);
                }
            }
            ans.add(temp);
        }
        return ans;
    }

    /**
     * 循环枚举
     */
    public static List<List<Integer>> subsetsEnumerate(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for (Integer n : nums) {
            int size = res.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSub = new ArrayList<Integer>(res.get(i));
                newSub.add(n);
                res.add(newSub);
            }
        }
        return res;
    }

    public static List<List<Integer>> recursionEnumerate ( int[] nums ) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add( new ArrayList<>());
        recursionEnumerate( nums , 0 , ans );
        return ans;
    }

    public static void recursionEnumerate (int[] nums , int index , List<List<Integer>> ans ) {
        if ( index >= nums.length ) {
            return ;
        }
        int n = ans.size();
        for ( int i = 0 ; i < n ; i++ ) {
            List<Integer> temp = new ArrayList<>(ans.get(i));
            temp.add( nums[index] );
            ans.add(temp);
        }
        recursionEnumerate( nums , index + 1 , ans);
    }

    public static void main(String[] args) {
        Solution78Subsets solution78 = new Solution78Subsets();
//        System.out.println(solution78.subsets(new int[]{1,2,3}));
//        System.out.println(solution78.subsetsEnumerate(new int[]{1,2,3}));
        System.out.println(solution78.recursionEnumerate(new int[]{1,2,3}));
    }
}
