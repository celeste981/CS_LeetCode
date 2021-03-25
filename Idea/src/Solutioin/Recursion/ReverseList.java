/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: ReverseList
 * Author:   CS
 * Date:     2021/3/24 20:59
 * Description: 反转链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Recursion;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈反转链表〉
 *
 * @author CS
 * @create 2021/3/24
 * @since 1.0.0
 */
public class ReverseList {

//    public ListNode reverseList ( ListNode head ) {
//        if ( head == null || head.next == null ) {
//            return head;
//        }
//        ListNode newHead = reverseList( head.next );
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }

    //尾递归
    public ListNode reverseList ( ListNode head ) {
        return recursion( head , null );
    }

    public ListNode recursion ( ListNode head  , ListNode postHead ) {
        if ( head == null ) {
            return postHead;
        }
        ListNode next = head.next;
        head.next = postHead;
        return recursion( next , head );
    }

}
