/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: KthGrammar
 * Author:   CS
 * Date:     2021/3/25 14:52
 * Description: 第K个语法符号
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch.Recursion;

/**
 * 〈一句话功能简述〉<br> 
 * 〈第K个语法符号〉
 *
 * @author CS
 * @create 2021/3/25
 * @since 1.0.0
 */
public class KthGrammar {
    public int kthGrammar ( int N , int K ) {
        if ( N == 1 && K == 1 ) {
            return 0;
        }
        int upIndex = K / 2 + K % 2;
        int num = kthGrammar( N - 1 , upIndex );
        if ( ( num + K) % 2 == 0) {
            return 1;
        }
        return 0;
    }
}
