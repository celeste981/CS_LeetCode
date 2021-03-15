/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: OddEvenList
 * Author:   Administrator
 * Date:     2021/3/15 11:59
 * Description: 奇偶链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈奇偶链表〉
 *
 * @author Administrator
 * @create 2021/3/15
 * @since 1.0.0
 */
public class OddEvenList {

    public ListNode oddEvenList ( ListNode head ) {
        if ( head == null ) {
            return head;
        }
        ListNode evenHead = head.next;
        ListNode oddCur = head , evenCur = evenHead;
        while ( evenCur != null && evenCur.next != null ) {
            //取出oddCur和evenCur并连接成链表
            oddCur.next = evenCur.next;
            oddCur = oddCur.next;
            evenCur.next = oddCur.next;
            evenCur = evenCur.next;
        }
        oddCur.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        OddEvenList oddEvenList = new OddEvenList();
    }
}
