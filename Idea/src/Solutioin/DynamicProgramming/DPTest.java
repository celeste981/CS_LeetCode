/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: DPTest
 * Author:   Administrator
 * Date:     2021/3/3 10:40
 * Description: 十级台阶
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈十级台阶〉
 *  总共十级台阶，每次只能选择走一步或者两步
 * @author Administrator
 * @create 2021/3/3
 * @since 1.0.0
 */
public class DPTest {

    public int recursion(int n) {
        if(n <= 2){
            return n;
        }
        return recursion(n-1) + recursion(n-2);
    }

    public int hash(int n) {
        if(n <= 2){
            return n;
        }
        HashMap<Integer , Integer> map = new HashMap<>();
        if(map.containsKey(n)){
            return map.get(n);
        } else {
            int val = hash(n - 1) + hash( n - 2);
            map.put( n , val );
            return val;
        }
    }

    public int dp( int n ) {
        if(n <= 2){
            return n;
        }
        int[] occ = new int[n];
        int a = 1;
        int b = 2;
        int temp = 0;
        for ( int i = 3 ; i < n+1 ; i++ ) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        DPTest dpTest = new DPTest();

    }
}
