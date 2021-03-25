/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Generate
 * Author:   CS
 * Date:     2021/3/24 19:07
 * Description: 杨辉三角
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈杨辉三角〉
 *
 * @author CS
 * @create 2021/3/24
 * @since 1.0.0
 */
public class Generate {

//    public List<List<Integer>> generate ( int numRows ) {
//        List<List<Integer>> ans = new ArrayList<>();
//        if ( numRows == 0 ) {
//            return ans;
//        }
//        for (int i = 0 ; i < numRows ; i++ ) {
//            List<Integer> row = new ArrayList<>();
//            for ( int j = 0 ; j <= i ; j++ ) {
//                if ( j == 0 || j == i ) {
//                    row.add(1);
//                } else {
//                    int num1 = ans.get(i - 1).get(j - 1);
//                    int num2 = ans.get(i - 1).get(j);
//                    row.add(num1 + num2);
//                }
//            }
//            ans.add(row);
//        }
//        return ans;
//    }

    public List<List<Integer>> generate ( int numRows ) {
        List<List<Integer>> ans = new ArrayList<>();
        if ( numRows == 0 ) {
            return ans;
        }
        for ( int i = 0 ; i < numRows ; i++ ) {
            List<Integer> row = new ArrayList<>();
            for ( int j = 0 ; j <= i ; j++ ) {
                row.add( fun(i , j));
            }
            ans.add(row);
        }
        return ans;
    }

    public int fun ( int i , int j ) {
        if( j == 0 || i == j ) {
            return 1;
        }
        return fun( i - 1 , j - 1 ) + fun( i - 1 , j );
    }

    public static void main(String[] args) {

    }
}
