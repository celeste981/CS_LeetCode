/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: StringTest
 * Author:   Administrator
 * Date:     2021/5/6 15:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package JavaBasics.String;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2021/5/6
 * @since 1.0.0
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);
        String s3 = s1.intern();
        String s4 = s2.intern();
        System.out.println(s3 == s4);
    }
}
