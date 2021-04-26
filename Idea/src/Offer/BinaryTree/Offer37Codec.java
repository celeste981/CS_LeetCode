/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer37Codec
 * Author:   CS
 * Date:     2021/4/26 16:41
 * Description: 序列化二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.BinaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈序列化二叉树〉
 *
 * @author CS
 * @create 2021/4/26
 * @since 1.0.0
 */
public class Offer37Codec {

    char SEP = ',';
    char NULL = '#';

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root , sb);
        return sb.toString();
    }

    public void serialize(TreeNode root , StringBuilder sb) {
        if (root == null) {
            sb.append(NULL).append(SEP);
            return;
        }
        sb.append(root.val).append(SEP);
        serialize(root.left , sb);
        serialize(root.right , sb);
    }

    public TreeNode deserialize(String data) {
        List<String> deleteSEP = new ArrayList<>();
        for (String s : data.split(",")) {
            deleteSEP.add(s);
        }
        return deserialize(deleteSEP);
    }

    public TreeNode deserialize(List<String> data) {
        String first = data.remove(0);
        if (first.equals("#")) {
            return null;
        }
        TreeNode cur = new TreeNode(Integer.parseInt(first));
        cur.left = deserialize(data);
        cur.right = deserialize(data);
        return cur;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;

        Offer37Codec offer37Codec = new Offer37Codec();
        System.err.println(offer37Codec.serialize(node1));
    }
}
