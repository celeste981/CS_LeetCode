/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: MergeTwoLists
 * Author:   CS
 * Date:     2021/3/25 10:40
 * Description: 合并两个有序链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Recursion;

/**
 * 〈一句话功能简述〉<br> 
 * 〈合并两个有序链表〉
 *
 * @author CS
 * @create 2021/3/25
 * @since 1.0.0
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists ( ListNode l1 , ListNode l2 ) {
        if ( l1 == null || l2 == null ) {
            return l1 == null ? l2 : l1 ;
        }
        if ( l1.val < l2.val ) {
            l1.next = mergeTwoLists( l1.next , l2 );
            return l1;
        } else {
            l2.next = mergeTwoLists( l1 , l2.next );
            return l2;
        }
    }

    public static void main(String[] args) {

    }
}
