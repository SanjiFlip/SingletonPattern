package com.xmaven.demo;

/**
 * @ClassName TestTwo
 * @Description TODO 懒汉式测试demo
 * @Author wangyi
 * @Date 2021/1/12 15:46
 * @Version 1.0.0
 **/
public class TestTwo {

    public static void main(String[] args) {
        Emperor one = Emperor.getInstance();
        Emperor two = Emperor.getInstance();
        Emperor three = Emperor.getInstance();
        System.out.println("三个皇帝对象依次是:");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }

}
