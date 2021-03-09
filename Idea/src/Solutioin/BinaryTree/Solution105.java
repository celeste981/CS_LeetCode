/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution105
 * Author:   CS
 * Date:     2021/3/8 23:36
 * Description: 从前序与中序遍历序列构造二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈从前序与中序遍历序列构造二叉树〉
 *
 * @author CS
 * @create 2021/3/8
 * @since 1.0.0
 */
public class Solution105 {

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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildRoot(preorder , 0 , preorder.length - 1 , inorder , 0 , inorder.length - 1 );
    }

    public TreeNode buildRoot(int[] preorder, int preStart , int preEnd , int[] inorder , int inStart , int inEnd) {
        if (preEnd < preStart) {
            return null;
        }
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        int index = 0;
        for (int i = inStart ; i <= inEnd ; i++ ) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }
        int leftSize = index - inStart;
        root.left = buildRoot(preorder , preStart + 1 , preStart + leftSize , inorder , inStart , index - 1);
        root.right = buildRoot(preorder , preStart + leftSize + 1, preEnd , inorder , index + 1 , inEnd);
        return root;
    }
    public static void main(String[] args) {
        Solution105 solution105 = new Solution105();
    }
}
