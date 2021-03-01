/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */


class Solution {
    public void nextPermutation(int[] nums) {
        //1.先找有没有逆序，有逆序则输出
        int i = 0 , j = 0, k = 0 , temp = 0 , flag = 0;
        //1.1  flag == 0 ， 表示未做任何改动
        //1.2  flag == 1 ,  表示找到了升序序列且已与子序列位第一个比nums[j-1]大的数交换
        for(i =  nums.length-1 ; i >= 0 ; i--){
            j = i;
            while(j >= 1){
                if(nums[j] > nums [j-1]){
                    temp = nums[j-1];
                    k = nums.length - 1;;
                    while(k >= j){
                        if(nums[k] > temp){
                            nums[j-1] = nums[k];
                            nums[k] = temp;
                            flag = 1; 
                            break;
                        }
                        k--;
                    }
                }
                if(flag == 1){
                    Arrays.sort(nums , j , nums.length);
                    break;    
                }
                j--;
            }
            if(flag == 1){
                break;
            }

        }

        //2.无逆序，sort，再输出
        if(flag == 0){
            Arrays.sort(nums); 
        }
    }
}


// @lc code=start

class Solution{
    public void nextPermutation(int[] nums){
        int i = 0 , j = 0 , temp = 0;
        for(i = nums.length - 1 ; i >= 1 ; i--){
            if(nums[i] > nums[i-1]){
                Arrays.sort(nums , i , nums.length);
                for(j = i ; j <= nums.length ; j++){
                    if(nums[i-1] < nums[j]){
                         temp = nums[j];
                         nums[j] = nums[i-1];
                         nums[i-1] = temp;
                         return ;
                    }
                }
            }
        }
        Arrays.sort(nums);
        
    }
}

// @lc code=end


