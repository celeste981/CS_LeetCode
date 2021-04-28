/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution633JudgeSquareSum
 * Author:   CS
 * Date:     2021/4/28 9:03
 * Description: 平方数之和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈平方数之和〉
 *
 * @author CS
 * @create 2021/4/28
 * @since 1.0.0
 */
public class Solution633JudgeSquareSum {

    public boolean judgeSquareSum(int c) {
        int j = (int)Math.sqrt(c);
        int i = 0;
        while (i <= j) {
            int curSum = (i*i) + (j*j);
            if (curSum == c){
                System.out.println("最终答案是" + i + "和" + j);
                return true;
            } else if (curSum > c) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution633JudgeSquareSum solution633JudgeSquareSum = new Solution633JudgeSquareSum();
        System.out.println(solution633JudgeSquareSum.judgeSquareSum(1));
    }

}
