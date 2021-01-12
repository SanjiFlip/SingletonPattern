package com.xmaven.test;

import com.xmaven.singleton.SingletonOne;

/**
 * @ClassName MainOne
 * @Description TODO 单例模式--饿汉式测试
 * @Author wangyi
 * @Date 2021/1/12 15:22
 * @Version 1.0.0
 **/
public class MainOne {

    public static void main(String[] args) {
        SingletonOne one = SingletonOne.getInstance();
        SingletonOne two = SingletonOne.getInstance();
        System.out.println(one);
        System.out.println(two);
        // 他们引用的都是一个地址
    }

}
