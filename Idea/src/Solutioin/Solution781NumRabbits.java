/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution781NumRabbits
 * Author:   CS
 * Date:     2021/4/6 14:55
 * Description: 森林中的兔子
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈森林中的兔子〉
 *
 * @author CS
 * @create 2021/4/6
 * @since 1.0.0
 */
public class Solution781NumRabbits {

    public int numRabbits(int[] answers) {
        int res = 0;
        Arrays.sort( answers );
        for ( int i = 0 ; i < answers.length ; i++ ) {
            int cur = answers[i];
            int cnt = answers[i];
            //遇到答案先加进来，最大限度的移动指针
            res += ( cur + 1 );
            while ( cnt >= 0 ) {
                if ( i < answers.length && answers[i] == cur ) {
                    cnt--;
                    i++;
                } else {
                    break;
                }
            }
            i--;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution781NumRabbits solution781NumRabbits = new Solution781NumRabbits();
        int[] exm1 = new int[]{ 1,2,2,2,2};
        int[] exm2 = new int[]{1};
        int[] exm3 = new int[]{1,0,1,0,0};
        System.out.println( solution781NumRabbits.numRabbits(exm1));
//        System.out.println( solution781NumRabbits.numRabbits(exm2));
//        System.out.println( solution781NumRabbits.numRabbits(exm3));
    }

}
