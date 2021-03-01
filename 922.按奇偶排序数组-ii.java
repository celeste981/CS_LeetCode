/*
 * @lc app=leetcode.cn id=922 lang=java
 *
 * [922] 按奇偶排序数组 II
 */



//两次遍历
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int n = A.length;
        int[] ans = new int [n];

        int i = 0;
        for(int x : A){
            if(x % 2 == 0){
                ans[i] = x;
                i = i + 2;
            }
        }
        i = 1;
        for(int x : A){
            if(x % 2 == 1){
                ans[i] = x;
                i = i + 2;
            }
        }
        return ans;
    }
}

// @lc code=start

//双指针
//i做偶数位，j做奇数位
//如果偶数位是奇数就进入循环，把奇数位的偶数换过来
//偶数位是偶数 或者奇数位是奇数都不管
class Solution{
    public int[] sortArrayByParityII(int[] A){
        int n = A.length;
        int i = 0 , j = 1;
        for(i = 0 ; i < n ; i+=2){
            while(A[i] % 2 == 1 ){
                while(A[j] % 2 == 1){
                    j += 2;
                }
                swap(A , i , j);
            }
        }
        return A;
    }


private void swap(int[] A , int i , int j){
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
}

}

// @lc code=end

