/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution117
 * Author:   CS
 * Date:     2021/3/14 11:10
 * Description: 填充每个节点的下一个右侧节点指针||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈填充每个节点的下一个右侧节点指针|| , 右侧为空则填充NULL〉
 *
 * @author CS
 * @create 2021/3/14
 * @since 1.0.0
 */
public class Solution117 {

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        if (root.left != null) {
            if (root.right != null) {
                root.left.next = root.right;
            } else {
                root.left.next = getNext(root.next);
            }
        }
        if (root.right != null) {
            root.right.next = getNext(root.next);
        }
        connect(root.right);
        connect(root.left);
        return root;
    }

    public Node getNext(Node root) {
        if (root == null) {
            return root;
        }
        if (root.left != null) {
            return root.left;
        } else if (root.right != null) {
            return root.right;
        } else {
            return getNext(root.next);
        }
    }

    public static void main(String[] args) {

    }
}
