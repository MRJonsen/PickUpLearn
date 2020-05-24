package com;

/**
 * @program: JavaDemo
 * @description: 单例模式
 * @author: jonsen
 * @create: 2020-04-07 23:20
 **/
public class SingleInstance {

    public static void main(String[] args) {

    }


    public static SingleInstance getInstance(){
        return SingleInstance.getInstance();

    }

    static class SingleInstanceHolder{
        public SingleInstance instance = new SingleInstance();
    }

}
