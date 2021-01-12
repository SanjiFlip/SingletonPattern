package com.xmaven.singleton;

/**
 * @ClassName SingletonOne
 * @Description TODO 单例模式 -- 饿汉模式 创建对象实例的时候直接初始化 空间换时间的形式
 * @Author wangyi
 * @Date 2021/1/12 15:17
 * @Version 1.0.0
 **/
public class SingletonOne {
    /**
     * 实现过程
     * 1. 只提供私有的构造方法
     * 2. 含有一个该类的私有对象
     * 3. 提供一个静态的公有引用与创建、获取静态私有对象
     */

    //1. 创建类中的私有构造
    private SingletonOne(){

    }

    //2. 创建该类型的私有静态实例
    private static SingletonOne instance = new SingletonOne();

    //3. 创建公有静态方法返回静态实例对象
    public static SingletonOne getInstance(){
        return instance;
    }



}
