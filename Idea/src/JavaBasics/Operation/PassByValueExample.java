/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: PassByValueExample
 * Author:   Administrator
 * Date:     2021/5/7 16:11
 * Description: 参数传递测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package JavaBasics.Operation;

/**
 * 〈一句话功能简述〉<br> 
 * 〈参数传递测试〉
 *
 * @author Administrator
 * @create 2021/5/7
 * @since 1.0.0
 */
public class PassByValueExample {

    public static class Dog {

        String name;

        Dog(String name) {
            this.name = name;
        }

        String getName() {
            return this.name;
        }


        void setName(String name) {
            this.name = name;
        }

        String getObjectAddress() {
            return super.toString();
        }

    }

    public static void func(Dog dog) {
        System.out.println(dog.getObjectAddress());        // Dog@b4c966a
        dog = new Dog("B");
        System.out.println(dog.getObjectAddress());        // Dog@2f4d3709
        System.out.println(dog.getName());                 // B
    }

    public static void main(String[] args) {
        Dog dog = new Dog("A");
        System.out.println(dog.getObjectAddress());       // Dog@b4c966a
        func(dog);
        System.out.println(dog.getObjectAddress());       // Dog@b4c966a
        System.out.println(dog.getName());                // A
    }
}
