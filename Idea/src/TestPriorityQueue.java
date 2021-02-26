/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: TestPriorityQueue
 * Author:   CS
 * Date:     2021/2/24 17:17
 * Description: 优先队列实现和测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.Comparator;

/**
 * 〈一句话功能简述〉<br> 
 * 〈优先队列实现和测试〉
 *  peek()  返回队首元素
 *  poll()  返回队首元素，队首元素出队列
 *  add()   添加元素
 *  size()  返回队列元素个数
 *  isEmpty()   判断队列是否为空
 * @author CS
 * @create 2021/2/24
 * @since 1.0.0
 */
public class TestPriorityQueue {

    static Comparator<Integer> cmp = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    };

    public static void main(String[] args) {
        TestPriorityQueue testPriorityQueue = new TestPriorityQueue();

    }
}
