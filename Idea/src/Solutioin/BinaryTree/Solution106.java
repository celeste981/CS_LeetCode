/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution106
 * Author:   CS
 * Date:     2021/3/9 9:14
 * Description: 从中序与后序遍历构造二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈从中序与后序遍历构造二叉树〉
 *
 * @author CS
 * @create 2021/3/9
 * @since 1.0.0
 */
public class Solution106 {

    public TreeNode buildTree(int[] inorder , int[] postorder) {
        return buildRoot(inorder , 0 , inorder.length - 1 , postorder , 0 , postorder.length - 1);
    }

    public  TreeNode buildRoot(int[] inorder , int inStart , int inEnd , int[] postorder , int poStart , int poEnd) {
        if (poEnd < poStart) {
            return null;
        }
        int rootVal = postorder[poEnd];
        TreeNode root = new TreeNode(rootVal);

        //找到左右子树序列的起始范围

        int index = 0;
        for (int num : inorder) {
            if ( num == rootVal ) {
                break;
            }
            index++;
        }
        int leftSize = index - inStart;
        root.left = buildRoot(inorder , inStart , index - 1 , postorder , poStart , poStart + leftSize - 1);
        root.right = buildRoot(inorder , index + 1 , inEnd , postorder , poStart + leftSize, poEnd - 1);
        return root;
    }

    public static void main(String[] args) {
        Solution106 solution106 = new Solution106();

    }
}
