/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int res = 0 , pre = dict(s.charAt(0));
        // int[] val = new int[26];
        // //创建哈希字典
        // val['I'] = 1;
        // val['V'] = 5;
        // val['X'] = 10;
        // val['L'] = 50;
        // val['C'] = 100;
        // val['D'] = 500;
        // val['M'] = 1000;
        for(int i = 1 ; i < s.length() ; i++){
            int temp = dict(s.charAt(i));
            if(pre < temp){
                res = res - pre;
            }
            else{
                res = res + pre;
            }
            pre = temp;
        }
        res = res + pre;
        return res;
    }
    private int dict(char ch){
        switch(ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
        
    }
}

// @lc code=end


class Solution {
    public int romanToInt (String s){
        //initial(s);
        s = s.replace("IV" , "a");
        s = s.replace("IX" , "b");
        s = s.replace("XL" , "c");
        s = s.replace("XC" , "d");
        s = s.replace("CD" , "e");
        s = s.replace("CM" , "f");
        int i = 0 , res = 0;
        for(i = 0 ; i < s.length() ; i++){
            res = res + dict(s.charAt(i));
        }
        return res;
    }

    // private void initial (String s){
    //     s.replace("IV" , "a");
    //     s.replace("IX" , "b");
    //     s.replace("XL" , "c");
    //     s.replace("XC" , "d");
    //     s.replace("CD" , "e");
    //     s.replace("CM" , "f");
    // }

    private int dict(char ch){
        switch(ch){
            case 'a' : return 4;
            case 'b' : return 9;
            case 'c' : return 40;
            case 'd' : return 90;
            case 'e' : return 400;
            case 'f' : return 900;
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
        
    }

}




