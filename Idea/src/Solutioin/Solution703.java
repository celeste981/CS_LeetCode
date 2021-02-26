/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution703
 * Author:   CS
 * Date:     2021/2/11 15:32
 * Description: 数据流中的第K大元素：设计一个找到数据流中第 k 大元素的类（class）。注意是排序后的第 k 大元素，不是第 k 个不同的元素。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.PriorityQueue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈数据流中的第K大元素：
 * 设计一个找到数据流中第 k 大元素的类（class）。
 * 注意是排序后的第 k 大元素，不是第 k 个不同的元素。〉
 *
 * @author CS
 * @create 2021/2/11
 * @since 1.0.0
 */
public class Solution703 {


    PriorityQueue<Integer> pq ;
    int k;

    public Solution703(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<Integer>();
        for (int x : nums){
            add(x);
        }
    }

    public int add(int val) {
        pq.offer(val);
        if(pq.size() > k){
            pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        Solution703 solution703 = new Solution703( 3 , new int[]{ 4 , 5 , 8 , 2} );

    }

}
