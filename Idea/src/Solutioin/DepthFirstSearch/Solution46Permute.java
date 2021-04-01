/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution46
 * Author:   CS
 * Date:     2021/2/3 21:40
 * Description: 全排列：给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈全排列：给定一个没有重复数字的序列，
 *  返回其所有可能的全排列。〉
 *
 * @author CS
 * @create 2021/2/3
 * @since 1.0.0
 */
public class Solution46Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> occ = new ArrayDeque<Integer>();
        boolean[] used = new boolean[nums.length];
        dfs(nums , used , occ , ans);
        return ans;
    }

    public void dfs(int[] nums , boolean[] used , Deque<Integer> occ , List<List<Integer>> ans){
        if(occ.size() == nums.length){
            ans.add(new ArrayList<>(occ));
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(!used[i]){
                occ.addLast(nums[i]);
                used[i] = true;

                System.out.println(" 回溯之前 => " + occ );
                dfs(nums , used , occ , ans);

                used[i] = false;
                occ.removeLast();
                System.out.println(" 回溯之后 => " + occ );
            }
        }
    }

    public static void main(String[] args) {
        Solution46Permute solution46 = new Solution46Permute();
        System.out.println(solution46.permute(new int[]{1 , 2 , 3 , 4}));
    }
}
