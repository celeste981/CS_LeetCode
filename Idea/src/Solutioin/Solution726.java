/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution726
 * Author:   CS
 * Date:     2021/2/24 10:14
 * Description: 原子的数量
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Map;
import java.util.TreeMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈原子的数量〉
 *
 * @author CS
 * @create 2021/2/24
 * @since 1.0.0
 */
public class Solution726 {
    int i;
    public String countOfAtoms(String formula) {
        StringBuilder ans = new StringBuilder();
        i = 0;
        Map<String , Integer> count = parse(formula);
        for(String name : count.keySet()) {
            ans.append(name);
            int mul = count.get(name);
            if(mul > 1){
                ans.append("" + mul);
            }
        }
        return ans.toString();
    }

    public Map<String , Integer> parse(String formula) {
        int N = formula.length();
        Map<String , Integer> count = new TreeMap();
        while(i < N && formula.charAt(i) != ')') {
            if(formula.charAt(i) == '(') {
                i++;
                for(Map.Entry<String , Integer> entry : parse(formula).entrySet()) {
                    count.put(entry.getKey() , count.getOrDefault(entry.getKey() , 0) + entry.getValue());
                }
            }
            else {
                int iStart = i++;
                while (i < N && Character.isLowerCase(formula.charAt(i))){
                    i++;
                }
                String name = formula.substring(iStart , i);
                iStart = i;
                while(i < N && Character.isDigit(formula.charAt(i))){
                    i++;
                }
                int mul = iStart < i ? Integer.parseInt(formula.substring(iStart , i)) : 1;
                count.put(name , count.getOrDefault(name , 0) + mul);
            }
        }

        int iStart = ++i;
        while( i < N && Character.isDigit(formula.charAt(i))) {
            i++;
        }
        if(iStart < i){
            int mul = Integer.parseInt(formula.substring(iStart , i));
            for(String key : count.keySet()){
                count.put(key , count.get(key) * mul);
            }
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
