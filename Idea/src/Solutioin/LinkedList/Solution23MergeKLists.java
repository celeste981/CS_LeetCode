/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution23MergeKLists
 * Author:   CS
 * Date:     2021/4/14 9:14
 * Description: 合并K个升序链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈合并K个升序链表〉
 *
 * @author CS
 * @create 2021/4/14
 * @since 1.0.0
 */
public class Solution23MergeKLists {

    public ListNode mergeKLists ( ListNode[] lists ) {
        if ( lists == null ) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        //装入的是链表们的头，每次取出最小的头装在结果链表中
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
//                if ( o1.val < o2.val ) {
//                    return -1;
//                } else {
//                    return 0;
//                }
                //comparator反应两个参数的权重。
                // 1是前者权重大，-1是后者。最后按照权重由小到大排序。
                // o1=4, o2=6, 返回1表示4权重大，权重默认升序最后4排后面即数值降序。

                //返回负数代表不交换,较小的参数放前面
                return o1.val - o2.val;
            }
        });
        //将原来的链表放入新链表
        for ( ListNode node : lists ) {
            if ( node != null ) {
                System.out.println(node.val);
                pq.add( node );
            }
        }
        //这里可以做一个优化
        //当pq.size == 1 时，跳出循环，避免重复进队出队
        while ( pq.size() > 1 ) {
            //从三个头中取出较小的
            //头结点后面接每次出队的元素
            cur.next = pq.poll();
            //cur指向刚取出的元素
            cur = cur.next;
            //如果刚取出的元素后面还有元素，加入队列，否则不用加入队列
            if ( cur.next != null ) {
                 pq.add( cur.next );
            }
        }
        cur.next = pq.poll();
        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
