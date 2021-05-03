/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution690GetImportance
 * Author:   CS
 * Date:     2021/5/1 15:38
 * Description: 员工的重要性
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈员工的重要性〉
 *
 * @author CS
 * @create 2021/5/1
 * @since 1.0.0
 */
public class Solution690GetImportance {

    static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
        public Employee(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    };

    HashMap<Integer, Employee> map = new HashMap<>();
    int ans = 0;
    public int getImportance(List<Employee> employees, int id) {
        // 深度优先搜索
        int n = employees.size();
        for (int i = 0; i < n; i++) {
            map.put(employees.get(i).id, employees.get(i));
        }
        getSum(id);
        return ans;
    }

    public void getSum(int curId) {
        ans += map.get(curId).importance;
        for (int sub : map.get(curId).subordinates) {
            getSum(map.get(sub).id);
        }
    }

//    public int getImportance(List<Employee> employees, int id) {
//        // 宽度优先搜索
//        int n = employees.size();
//        HashMap<Integer, Employee> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            map.put(employees.get(i).id, employees.get(i));
//        }
//        Deque<Employee> queue = new ArrayDeque<>();
//        queue.offer(map.get(id));
//        int ans = 0;
//        while (!queue.isEmpty()) {
//            Employee cur = queue.poll();
//            ans += cur.importance;
//            for (int sub : cur.subordinates) {
//                queue.offer(map.get(sub));
//            }
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        Solution690GetImportance solution690GetImportance = new Solution690GetImportance();
        List<Employee> employees = new ArrayList<>();
//        employees.add(1, 2, new List<Integer>(){2});
//        System.out.println(solution690GetImportance.getImportance());
    }
}
