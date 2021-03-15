/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: IsPalindrome
 * Author:   Administrator
 * Date:     2021/3/15 12:38
 * Description: 回文链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

import javax.swing.plaf.InsetsUIResource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈回文链表〉
 *
 * @author Administrator
 * @create 2021/3/15
 * @since 1.0.0
 */
public class IsPalindrome {

//    ListNode first;
//
//    public boolean isPalindrome ( ListNode head ) {
//        first = head;
//        return recursion(head);
//    }
//
//    public boolean recursion ( ListNode cur ) {
//        if ( cur != null ) {
//            if (!recursion(cur.next)) {
//                return false;
//            }
//            if ( cur.val != first.val ) {
//                return false;
//            }
//            if ( first != null ) {
//                first = first.next;
//            }
//        }
//        return true;
//    }

    public boolean isPalindrome ( ListNode head ) {
        if ( head == null || head.next ==null ) {
            return true;
        }
        //一边遍历，一边反转前半段链表
        ListNode fast = head , slow = head ;
        ListNode curHead = null , next ;
        while ( fast != null && fast.next != null ) {
            fast = fast.next.next;
            //保存未翻转节点
            next = slow.next;
            //翻转当前节点
            slow.next = curHead;
            //更新头节点
            curHead = slow;
            //更新当前节点
            slow = next;
        }
        if ( fast != null ){
            slow = slow.next;
        }
        while ( curHead != null && slow != null ) {
            if ( curHead.val != slow.val ) {
                return false;
            }
            curHead = curHead.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
    }
}
