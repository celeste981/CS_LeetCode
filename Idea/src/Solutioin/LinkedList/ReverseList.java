/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: ReverseList
 * Author:   Administrator
 * Date:     2021/3/15 10:14
 * Description: 反转链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br>
 * 〈反转链表〉
 *
 * @author Administrator
 * @create 2021/3/15
 * @since 1.0.0
 */
public class ReverseList {

    public ListNode reverseList ( ListNode head ) {
        ListNode curHead = null ;
        ListNode cur = head;
        ListNode next = head;
        while ( cur != null ) {
            //保存未反转的节点
            next = next.next;
            //反转当前节点
            cur.next = curHead;

            //更新curHead
            curHead = cur;
            //更新待反转节点
            cur = next;
        }
        return curHead;
    }

    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
    }
}
