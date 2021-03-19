/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1603
 * Author:   Administrator
 * Date:     2021/3/19 8:55
 * Description: 设计停车系统
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈设计停车系统〉
 *
 * @author Administrator
 * @create 2021/3/19
 * @since 1.0.0
 */
public class Solution1603ParkingSystem {
    int big;
    int medium;
    int small;

    public Solution1603ParkingSystem( int big , int medium , int small ) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar( int carType ) {
        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            }
        } else if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            }
        } else if (carType == 3) {
            if (small > 0) {
                small--;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
