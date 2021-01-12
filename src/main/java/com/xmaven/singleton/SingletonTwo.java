package com.xmaven.singleton;

/**
 * @ClassName SingletonTwo
 * @Description TODO 单例模式--懒汉式 类内实例对象创建时并直接初始化，知道第一次调用get方法时，才完成初始化操作  时间换空间
 * @Warning  懒汉式存在进程风险
 * @Deal  解决方法 1. 同步锁  2. 双重检验锁 3. 静态内部内 4. 枚举
 * @Author wangyi
 * @Date 2021/1/12 15:28
 * @Version 1.0.0
 **/
public class SingletonTwo {

    //1. 创建私有构造方法
    private SingletonTwo(){

    }

    //2. 创建静态的该类实例对象
    private static SingletonTwo instance = null;

    //3. 创建开放的静态方法提供实例对象
    public static SingletonTwo getInstance(){
        if (instance == null){
            instance = new SingletonTwo();
        }
        return instance;
    }

}
