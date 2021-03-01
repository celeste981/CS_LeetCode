import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * @lc app=leetcode.cn id=989 lang=java
 *
 * [989] 数组形式的整数加法
 */


class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ansList = new ArrayList<Integer>();
        //以防K是大数，转为数组
            //1.计算位数
        int lenB = 0;
        while(K >= Math.pow(10 , lenB)){
            lenB++;
        }
            //2.把K装进数组
        int[] B = new int[lenB];
        while(lenB > 0){
            B[--lenB] = K % 10;
            K = K / 10;
        }
        int carry = 0 ;
        for(int i = A.length - 1  , j = B.length - 1 ;
        i >= 0 || j >= 0 || carry != 0 ; i-- , j--){
            int n1 = i < 0 ? 0 : A[i] ;
            int n2 = j < 0 ? 0 : B[j];
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            ansList.add(sum % 10);
        }
        Collections.reverse(ansList);
        return ansList;

    }
}


// @lc code=start
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ansList = new ArrayList<Integer>();
        int lenB = 0;
        while(K >= Math.pow(10 , lenB)){
            lenB++;
        }
        //把B装进数组
        int[] B = new int[lenB];
        while(lenB > 0){
            B[--lenB] = K % 10;
            K = K / 10;
        }
        int carry = 0;
        for(int i = A.length - 1 , j = B.length - 1 ; 
        i >= 0 || j >= 0 || carry != 0 ; i-- , j--){
            int n1 = i < 0 ? 0 : A[i];
            int n2 = j < 0 ? 0 : B[j];
            ansList.add( ( n1 + n2 + carry ) % 10);
            carry = ( n1 + n2 + carry ) / 10;
        }
        Collections.reverse(ansList);
        return ansList;
    }
}

// @lc code=end
