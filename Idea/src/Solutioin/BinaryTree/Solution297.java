/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution297
 * Author:   CS
 * Date:     2021/3/9 9:52
 * Description: 二叉树的序列化与反序列化
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的序列化与反序列化〉
 *
 * @author CS
 * @create 2021/3/9
 * @since 1.0.0
 */
public class Solution297 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {};
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val , TreeNode left , TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

        String SEP = ",";
        String NULL = "#";
        //Encode a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            serialize(root , sb);
            return sb.toString();
        }
        public void serialize(TreeNode root , StringBuilder sb) {
            if (root == null) {
                sb.append(NULL).append(SEP);
                return ;
            }
            sb.append(root.val).append(SEP);
            serialize(root.left , sb);
            serialize(root.right , sb);
        }

        //Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            List<String> nodes = new ArrayList<>();
            for (String s : data.split(",")) {
                nodes.add(s);
            }
            return deserialize(nodes);
        }
        public TreeNode deserialize(List<String> nodes) {
            if (nodes.isEmpty()){
                return null;
            }
            String first = nodes.remove(0);
            if (first.equals(NULL)) {
                return null;
            }
            TreeNode root = new TreeNode(Integer.parseInt(first));
            System.out.println(root.val);
            root.left = deserialize(nodes);
            root.right = deserialize(nodes);
            return root;
        }

    public static void main(String[] args) {
        Solution297 solution297 = new Solution297();
        System.out.println(solution297.serialize(solution297.deserialize("1,2,#,4,#,#,3,#,#")));;
    }
}
