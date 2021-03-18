/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: MyDoubleLinkedList
 * Author:   CS
 * Date:     2021/3/15 23:00
 * Description: 双链表初始化
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈双链表初始化〉
 *
 * @author CS
 * @create 2021/3/15
 * @since 1.0.0
 */
public class MyDoubleLinkedList {

    int size;
    private ListNode dummyHead , dummyTail;

    public MyDoubleLinkedList() {
        size = 0;
        dummyHead = new ListNode(0);
        dummyTail = new ListNode(0);
        dummyTail.prev = dummyHead;
        dummyHead.next = dummyTail;
    }

//    public int get(int index ) {
//        if ( index < 0 || index >= size) {
//            return -1;
//        }
//        //ListNode preNode = getPreNode(index);
//        //return preNode.next.val;
//    }
}
