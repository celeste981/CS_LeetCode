/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: GetRow
 * Author:   CS
 * Date:     2021/3/24 20:29
 * Description: 杨辉三角||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch.Recursion;

import java.util.Arrays;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈杨辉三角||〉
 *
 * @author CS
 * @create 2021/3/24
 * @since 1.0.0
 */
public class GetRow {

    public List<Integer> getRow ( int rowIndex ) {
        Integer[] ans = new Integer[rowIndex + 1];
        get(rowIndex , ans , 0);
        return Arrays.asList(ans);
    }

    public void get ( int rowIndex , Integer[] ans , int curRow ) {
        if ( curRow > rowIndex ) {
            return ;
        }
        for ( int i = 0 ; i <= curRow ; i++ ) {
            int temp = 0;
            if ( i == 0 || i == curRow ) {
                ans[i] = 1;
                temp = ans[i];
            }  else {
                int curVal = ans[i];
                ans[i] = curVal + temp;
                temp = curVal;
            }
        }
        get( rowIndex , ans , curRow + 1 );
    }

    public static void main(String[] args) {

    }
}
