/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: CachePoolTest
 * Author:   Administrator
 * Date:     2021/4/29 15:53
 * Description: 缓存池测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package JavaBasics.DataType;

/**
 * 〈一句话功能简述〉<br> 
 * 〈缓存池测试〉
 *
 * @author Administrator
 * @create 2021/4/29
 * @since 1.0.0
 */
public class CachePoolTest {
    public static void main(String[] args) {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x == y);
        // 查看valueOf源代码
        Integer z = Integer.valueOf(123);
        Integer k = Integer.valueOf(123);
        System.out.println(z == k);
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);
        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d);
    }
}
