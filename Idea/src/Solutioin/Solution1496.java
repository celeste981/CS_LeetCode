/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1496
 * Author:   CS
 * Date:     2021/2/7 21:04
 * Description: 判断路径是否相交：如果路径在任何位置上出现相交的情况，也就是走到之前已经走过的位置，请返回 True ；否则，返回 False 。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br> 
 * 〈判断路径是否相交：
 * 如果路径在   任何位置上  出现相交的情况，
 * 也就是走到之前已经走过的位置，请返回 True ；
 * 否则，返回 False 。〉
 *
 * 1 <= path.length <= 10^4
 *
 * @author CS
 * @create 2021/2/7
 * @since 1.0.0
 */
public class Solution1496 {
    public boolean isPathCrossing(String path) {
        int x = 0 , y = 0;
        int n = path.length();
        Set<Integer> occ = new HashSet<Integer>();
        occ.add(x * 100000 + y);
        for(int i = 0 ; i < n ; i++){
            switch (path.charAt(i)){
                case 'N' :  y++; break;
                case 'S' :  y--; break;
                case 'E' :  x++; break;
                case 'W' :  x--; break;
            }
            if(!occ.add(x * 100000 + y)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Solution1496 solution1496 = new Solution1496();
        System.out.println(solution1496.isPathCrossing("NNSWWEWSSESSWENNW"));
    }
}
