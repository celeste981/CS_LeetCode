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

//    public Node flatten(Node head) {
//        if ( head == null ) {
//            return null;
//        }
//        Node flattenHead = new Node( 0 , null , head , null ) ;
//
//        flattenDFS( flattenHead , head);
//
//        flattenHead.next.prev = null;
//        return flattenHead.next;
//    }
//
//    public Node flattenDFS ( Node prev , Node cur ) {
//        if ( cur == null ) {
//            return null;
//        }
//        cur.prev = prev;
//        prev.next = cur;
//    }

    public Node flatten ( Node head ) {
        if ( head == null ) {
            return head;
        }
        Node flattenHead = new Node( 0 , null , null , null) ;
        Node cur = flattenHead;
        recursion( flattenHead , head, flattenHead);
        Node newHead = flattenHead.next;
        newHead.prev = null;
        return newHead;
    }

    public Node recursion ( Node cur , Node head , Node listnode) {
        if ( head == null ) {
            System.out.println(listnode.val);
            return listnode;
        }
        cur.next = new Node(head.val , listnode , null , null );
        cur = cur.next;
        listnode = cur;
        Node listnode1 = recursion(cur , head.child, listnode);
        System.out.println(listnode1.val);
        Node listnode2 = recursion(cur , head.next, listnode1);
        System.out.println(listnode2.val);
        return listnode2;
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
