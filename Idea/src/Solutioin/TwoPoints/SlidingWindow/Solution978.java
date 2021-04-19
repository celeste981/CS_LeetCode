/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution978
 * Author:   CS
 * Date:     2021/2/8 12:31
 * Description: 最长湍流子数组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints.SlidingWindow;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最长湍流子数组〉
 *
 * @author CS
 * @create 2021/2/8
 * @since 1.0.0
 */
public class Solution978 {

    public int maxTurbulenceSize2(int[] arr) {
        int ans = 1;
        int n = arr.length , right = 1 , left = 0;
        if(n < 2){
            return n;
        }
        boolean pre = false , cur = false;
        while(right < n){
            cur = arr[right - 1] < arr[right];
            if(cur == pre){
                left = right - 1;
            }
            if(arr[right - 1] == arr[right]){
                left = right;
            }
            right++;
            ans = Math.max(ans , right - left);
            pre = cur;
        }
        return ans;
    }

    public int maxTurbulenceSize(int[] arr) {
        int ans = 1;
        int n = arr.length , right = 0 , left = 0;
        while(right < n - 1){
            if(left == right){
                if(arr[left] == arr[left + 1]){
                    left++;
                }
                right++;
            }
            else{
                if(arr[right - 1] < arr[right] &&
                arr[right] > arr[right + 1]){
                    right++;
                }
                else if(arr[right - 1] > arr[right] &&
                arr[right] < arr[right + 1]){
                    right++;
                }
                else{
                    left = right;
                }
            }
            ans = Math.max( ans , right - left + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution978 solution978 = new Solution978();
        System.out.println(solution978.maxTurbulenceSize(new int[]{9,4,2,10,7,8,8,1,9}));
    }
}
