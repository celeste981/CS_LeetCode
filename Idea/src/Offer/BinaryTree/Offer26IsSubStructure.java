/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer26IsSubStructure
 * Author:   CS
 * Date:     2021/4/23 10:37
 * Description: 树的子结构
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈树的子结构〉
 *
 * @author CS
 * @create 2021/4/23
 * @since 1.0.0
 */
public class Offer26IsSubStructure {

//    public boolean isSubStructure (TreeNode A , TreeNode B) {
//        if (A == null || B == null) {
//            return false;
//        }
//        return isSame(A , B) || isSubStructure(A.left , B) || isSubStructure( A.right , B);
//    }
//
//    public boolean isSame (TreeNode a , TreeNode b) {
//        if (b == null) {
//            return true;
//        } else if (a == null) {
//            return false;
//        } else {
//            return a.val == b.val && isSame(a.left , b.left) && isSame(a.right , b.right);
//        }
//    }

    public boolean isSubStructure (TreeNode A , TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return isSimilar(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public boolean isSimilar(TreeNode x, TreeNode y) {
        if (y == null) {
            // B树搜索完成，未发现不一致，return true
            return true;
        } else if (x == null) {
            // B树未搜索完成，此时A树已经为空了，return false
            return false;
        } else {
            return x.val == y.val && isSimilar(x.left, y.left) && isSimilar(x.right, y.right);
        }
    }

    public static void main(String[] args) {

    }
}
