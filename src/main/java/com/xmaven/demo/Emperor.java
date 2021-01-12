package com.xmaven.demo;

/**
 * @ClassName Emperor
 * @Description TODO 懒汉式 demo
 * @Author wangyi
 * @Date 2021/1/12 15:44
 * @Version 1.0.0
 **/
public class Emperor {

    private Emperor(){

    }

    private static int i = 1;
    private static Emperor instance = null;

    public static Emperor getInstance(){
        if (instance == null){
            instance = new Emperor();
        }
        System.out.println("创建"+(i++)+"号皇帝对象");
        return instance;
    }
}
