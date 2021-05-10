/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: ToStringExample
 * Author:   Administrator
 * Date:     2021/5/10 16:29
 * Description: toString()测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package JavaBasics.ObjectMethod;

/**
 * 〈一句话功能简述〉<br> 
 * 〈toString()测试〉
 *
 * @author Administrator
 * @create 2021/5/10
 * @since 1.0.0
 */
public class ToStringExample {

    private int number;

    public ToStringExample(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        ToStringExample example = new ToStringExample(123);
        System.out.println(example.toString());
        // 输出结果：JavaBasics.ObjectMethod.ToStringExample@10f87f48
    }

}
