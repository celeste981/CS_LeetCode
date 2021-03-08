/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1640
 * Author:   Administrator
 * Date:     2021/3/8 10:43
 * Description: 能否连接形成数组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈能否连接形成数组〉
 *
 * @author Administrator
 * @create 2021/3/8
 * @since 1.0.0
 */
public class Solution1640 {

    public boolean canFormArray(int[] arr, int[][] pieces) {
        List<Integer> ans = new ArrayList<>();
        for (int num : arr ) {
            for (int j = 0 ; j < pieces.length ; j++ ) {
                if (num == pieces[j][0]){
                    for (int num2 : pieces[j]) {
                        ans.add(num2);
                    }
                }
            }
        }
        if (arr.length != ans.size()) {
            return false;
        }
        for (int i = 0 ; i < arr.length ; i++ ) {
            if (arr[i] != ans.get(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution1640 solution1640 = new Solution1640();
        System.out.println(solution1640.canFormArray(new int[]{15,88} ,
                new int[][]{ {88} , {15} }));
    }
}
