/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if(( s.length() & 1 ) == 1){
            return false;
        }
        Map<Character , Character> pairs = new HashMap<Character , Character>(){
            {
                put( ')' , '(' );
                put( ']' , '[' );
                put( '}' , '{' );
            }
        };
        Stack<Character> stack = new Stack<Character>();
        //int n = s.length();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ){
                stack.push(s.charAt(i));
            }
            else if(stack.isEmpty() || stack.pop() != pairs.get(s.charAt(i)) ){
                return false;
            }
        } 
        return stack.isEmpty();
    }
}
// @lc code=end

