/*
 * @lc app=leetcode.cn id=1128 lang=java
 *
 * [1128] 等价多米诺骨牌对的数量
 */


//暴力法会Runtime ERROR
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int n = dominoes.length;
        int count = 0;
        for(int i = 0 ; i < n-1 ; i++){
            
            for(int j = i + 1 ; j < n ; j++){
                if( (( 0 == dominoes[i][0] - dominoes[j][0]) && ( 0 == dominoes[i][1] - dominoes[j][1]) ) ||
                (( 0 == dominoes[i][0] - dominoes[j][1]) && ( 0 == dominoes[i][1] - dominoes[j][0]) ) ){
                    count++;
                }
            }
        }
        return count;
    }
}

// @lc code=start
//二位数
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int ans = 0;
        int[] num = new int[100];
        for(int[] dominoe : dominoes){
            int val = dominoe[0] < dominoe[1] ? dominoe[1] * 10 + dominoe[0] : dominoe[0] * 10 + dominoe[1];
            ans = ans + num[val];
            num[val]++;
        }
        return ans;
    }
}
// @lc code=end


//HashMap
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {

        Map<Pair , Integer> freq = new HashMap<>(100);
        for(int[] dominoe : dominoes){
            Pair key = new Pair(dominoe[0] , dominoe[1]);
            freq.put(key , freq.getOrDefault(key , 0) + 1);
        }

        int count = 0;
        for(int f : freq.values()) {
            count = count + (f * (f - 1)) / 2;
        }
        return count;
    }
}

private class Pair {
    private int key;
    private int value;
    public Pair(int key , int value){
        this.key = key;
        this.value = value;
    }
    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Pair pair = (Pair) o;
        return key == pair.key && value == pair.value || key == pair.value && value == pair.key;
    }

    @Override
    public int hashCode() {
        if(key > value){
            return value * 10 + key;
        }
        return key * 10 + value;
    }
}