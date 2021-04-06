/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution605CanPlaceFlowers
 * Author:   CS
 * Date:     2021/4/6 16:04
 * Description: 种花问题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈种花问题〉
 *
 * @author CS
 * @create 2021/4/6
 * @since 1.0.0
 */
public class Solution605CanPlaceFlowers {

    private boolean canPlaceFlowers ( int[] flowerbed , int n ) {
        for ( int i = 0 ; i < flowerbed.length ; i++ ) {
            int count = 0;
            while ( i < flowerbed.length && flowerbed[i] == 0 ) {
                //最开始和最末尾没有1，那么可以补一个0在边界
                //最开始和最末尾可能重合 比如{0}
                //分开补0
                if ( i == 0 ) {
                    count++;
                }
                if ( i == flowerbed.length - 1 ) {
                    count++;
                }
                count++;
                i++;
            }
            if ( count >= 3 ) {
                count -= 2;
                count = ( count & 1 ) == 0 ? count / 2 : count / 2 + 1;
                n -= count;
            }
            if ( n <= 0 ) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution605CanPlaceFlowers solution605CanPlaceFlowers = new Solution605CanPlaceFlowers();
        int[] flowerbed = new int[]{0,0,1,0,0,0,1};
        System.out.println(solution605CanPlaceFlowers.canPlaceFlowers( flowerbed , 3));
    }

}
