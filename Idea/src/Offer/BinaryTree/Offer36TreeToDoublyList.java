/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer36TreeToDoublyList
 * Author:   CS
 * Date:     2021/4/23 9:31
 * Description: 二叉搜索树与双向链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉搜索树与双向链表〉
 *
 * @author CS
 * @create 2021/4/23
 * @since 1.0.0
 */
public class Offer36TreeToDoublyList {

    Node pre = null;
    Node head = null;
//    Node tail = null;    //尾结点就是最后的pre

    public Node treeToDoublyList (Node root) {
        if (root == null) {
            return null;
        }
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    public void dfs(Node root) {
        if (root == null) {
            return ;
        }
        dfs(root.left);
        if (pre == null) {
            //找到头节点
            head = root;
        } else {
            //修改pre和当前节点的链域，构造双向链表
            pre.right = root;
            root.left = pre;
        }
        //更新pre
        pre = root;
        dfs(root.right);
    }

    public static void main(String[] args) {

    }
}
