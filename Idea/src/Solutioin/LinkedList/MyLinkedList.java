/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: MyLinkedList
 * Author:   CS
 * Date:     2021/3/14 17:11
 * Description: 设计一个链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈设计一个链表〉
 *
 * @author CS
 * @create 2021/3/14
 * @since 1.0.0
 */
public class MyLinkedList {

    int size;
    ListNode head;

    //初始化
    /** Initialize your data structure here. */
    MyLinkedList() {
        size = 0;
        head = new ListNode();
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index > size || index < 0 ) {
            return -1;
        }
        ListNode cur = head;
        for ( int i = 0 ; i < index + 1 ; i++ ) {
            cur = cur.next;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0 , val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size , val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return ;
        }
        if ( index < 0 ) {
            index = 0;
        }
        size++;
        ListNode cur = head;
        for ( int i =  0 ; i < index ; i++ ) {
            cur = cur.next;
        }
        ListNode add = new ListNode(val);
        add.next = cur.next;
        cur.next = add;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if ( index < 0 || index >= size ) {
            return ;
        }
        size--;
        ListNode cur = head;
        for (int i = 0 ; i < index ; i++ ) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
    }

    public static void main(String[] args) {

    }
}
