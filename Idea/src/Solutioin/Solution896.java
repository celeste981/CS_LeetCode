/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution896
 * Author:   CS
 * Date:     2021/2/28 22:49
 * Description: 单调数列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import Solutioin.Recursion.Solution78;

/**
 * 〈一句话功能简述〉<br> 
 * 〈单调数列〉
 *
 * @author CS
 * @create 2021/2/28
 * @since 1.0.0
 */
public class Solution896 {
    public boolean isMonotonic(int[] A) {
        boolean flagInc = false;
        boolean flagDea = false;
        for ( int i = 1 ; i < A.length ; i++ ){
            if(A[i] > A[i-1]){
                flagInc = true;
            }
            if(A[i] < A[i-1]){
                flagDea = true;
            }
        }
        return !(flagDea && flagInc);
    }

    public static void main(String[] args) {
        Solution896 solution896 = new Solution896();
        System.out.println(solution896.isMonotonic(new int[]{1,2,2,3}));
    }

}
