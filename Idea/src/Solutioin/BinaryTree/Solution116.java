/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution116
 * Author:   Administrator
 * Date:     2021/3/4 16:19
 * Description: 填充每个节点的下一个右侧节点指针
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import Solutioin.Solution925;

/**
 * 〈一句话功能简述〉<br> 
 * 〈填充每个节点的下一个右侧节点指针〉
 *
 * @author Administrator
 * @create 2021/3/4
 * @since 1.0.0
 */
public class Solution116 {

    public class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            this.val = _val;
        }

        public Node(int _val , Node _left , Node _right , Node _next) {
            this.val = _val;
            this.left = _left;
            this.right = _right;
            this.next = _next;
        }
    }

    public Node connect(Node root) {
        if (root == null ) {
            return root;
        }
        connectTwoNode(root.left , root.right);
        return root;
    }

    //输入两个节点，将两个节点连接起来
    //递归连接相同父节点的两个子节点
    //   连接不同父节点的两个子节点
    public void connectTwoNode(Node node1 , Node node2 ) {
        if(node1 == null || node2 == null ) {
            return ;
        }
        //将传入的两个节点连接
        node1.next = node2;
        connectTwoNode(node1.left , node1.right);
        connectTwoNode(node2.left , node2.right);
        connectTwoNode(node1.right , node2.left);
    }
    public static void main(String[] args) {
        Solution116 solution116 = new Solution116();
    }
}
