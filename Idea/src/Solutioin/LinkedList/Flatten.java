/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Flatten
 * Author:   CS
 * Date:     2021/3/16 21:01
 * Description: 扁平化多级双向链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈扁平化多级双向链表〉
 *
 * @author CS
 * @create 2021/3/16
 * @since 1.0.0
 */
public class Flatten {

//    Node last = null;
//    public Node flatten(Node head) {
//        if ( head == null ) {
//            return null;
//        } else if ( head.next == null && head.child == null ) {
//            last = head;
//            return head;
//        } else if ( head.child == null ) {
//            head.next = flatten(head.next);
//            head.next.prev = head;
//        } else {
//            Node curSplit = head.next;
//            head.next = flatten(head.child);
//            head.next.prev = head;
//            if ( last != null && curSplit != null) {
//                last.next = flatten(curSplit);
//                last.next.prev = last;
//            }
//        }
//        head.child = null;
//        return head;
//    }

    Node cur;

    public Node flatten ( Node head ) {
        if ( head == null ) {
            return head;
        }
        Node flattenHead = new Node( 0 , null , null , null) ;
        cur = flattenHead;
        recursion( head);
        Node newHead = flattenHead.next;
        newHead.prev = null;
        return newHead;
    }

    public void recursion (  Node head) {
        if ( head == null ) {
            return ;
        }
        cur.next = new Node(head.val , cur , null , null );
        cur = cur.next;
        recursion( head.child);
        recursion( head.next);
    }

    public static void main(String[] args) {
        Node root = new Node( 1 , null ,  null , null );
        Node r = new Node( 2 , root ,  null , null );
        Node rr = new Node( 5 , r ,  null , null );
        Node rl = new Node( 3 , null ,  null , null );
        Node rlr = new Node( 4 , rl ,  null , null );
        root.next = r;
        r.next = rr;    r.child = rl;
        rl.next = rlr;
        Flatten flatten = new Flatten();
        flatten.flatten(root);
    }
}
