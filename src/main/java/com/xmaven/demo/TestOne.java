package com.xmaven.demo;

/**
 * @ClassName TestOne
 * @Description TODO 测试饿汉式demo
 * @Author wangyi
 * @Date 2021/1/12 15:42
 * @Version 1.0.0
 **/
public class TestOne {
    public static void main(String[] args) {
        Earth one = Earth.getInstance();
        Earth two = Earth.getInstance();
        Earth three = Earth.getInstance();
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
