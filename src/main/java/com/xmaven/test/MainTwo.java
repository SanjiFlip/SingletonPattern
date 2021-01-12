package com.xmaven.test;

import com.xmaven.singleton.SingletonTwo;

/**
 * @ClassName MainTwo
 * @Description TODO 单例模式 -- 懒汉式测试
 * @Author wangyi
 * @Date 2021/1/12 15:33
 * @Version 1.0.0
 **/
public class MainTwo {

    public static void main(String[] args) {
        SingletonTwo one = SingletonTwo.getInstance();
        SingletonTwo two = SingletonTwo.getInstance();
        System.out.println(one);
        System.out.println(two);
    }

}
