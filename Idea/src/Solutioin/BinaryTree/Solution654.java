/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution654
 * Author:   Administrator
 * Date:     2021/3/8 16:58
 * Description: 最大二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import Solutioin.Solution1;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最大二叉树〉
 *
 * @author Administrator
 * @create 2021/3/8
 * @since 1.0.0
 */
public class Solution654 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums , 0 , nums.length - 1);
    }

    public  TreeNode build(int[] nums , int low , int high) {
        if (low > high) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = low ; i <= high ; i++ ) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        System.out.println(max);
        root.left = build(nums , low, index - 1);
        root.right = build(nums , index + 1 , high);
        return root;
    }

    public static void main(String[] args) {
        Solution654 solution654 = new Solution654();
        System.out.println(solution654.constructMaximumBinaryTree(new int[]{3,2,1,6,0,5}));
    }
}
