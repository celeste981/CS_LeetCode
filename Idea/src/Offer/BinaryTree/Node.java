/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Node
 * Author:   CS
 * Date:     2021/3/14 11:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author CS
 * @create 2021/3/14
 * @since 1.0.0
 */
public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
