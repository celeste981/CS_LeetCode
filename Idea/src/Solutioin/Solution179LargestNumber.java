/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution179LargestNumber
 * Author:   CS
 * Date:     2021/4/12 10:45
 * Description: 最大数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最大数〉
 *
 * @author CS
 * @create 2021/4/12
 * @since 1.0.0
 */
public class Solution179LargestNumber {

    public String largestNumber ( int[] nums ) {
        int n = nums.length;
        String numsToWord[] = new String[n];
        for(int i = 0 ; i < n ; i++ ){
            numsToWord[i] = String.valueOf(nums[i]);
        }
        //[233，23333]排序后变为[23333，233]
        Arrays.sort(numsToWord,(a, b)->{
            return (b+a).compareTo(a+b);
        });
        //如果排序后的第一个元素是0，那后面的元素肯定小于或等于0，则可直接返回0
        if(numsToWord[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++ ){
            sb.append(numsToWord[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution179LargestNumber solution179LargestNumber = new Solution179LargestNumber();
        System.out.println(solution179LargestNumber.largestNumber( new int[]{ 3,30,34,5,9 }));
    }

}
