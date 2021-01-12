package com.xmaven.demo;

/**
 * @ClassName Earth
 * @Description TODO 饿汉式 demo
 * @Author wangyi
 * @Date 2021/1/12 15:38
 * @Version 1.0.0
 **/
public class Earth {

    private Earth(){
        System.out.println("地球诞生");
    }
    private static int i = 1;
    private static Earth instance = new Earth();

    public static Earth getInstance(){
        System.out.println("第"+(i++)+ "个地球创建中");
        return instance;
    }

}
