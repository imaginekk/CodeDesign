package com.imagine;

import javax.xml.stream.FactoryConfigurationError;

/**
 * @author imagine
 * @date 2023/7/10/0010 - 16:10
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance1= Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);

    }
}

/**
 *  单例模式懒汉式
 * 私有化构造器（没办法通过new创建对象）
 * 定义一个静态的不可变的属性直接生成一个对象
 * 静态方法获取该对象
 *
 */
class Singleton{
    private final static Singleton instance = new Singleton();
    private Singleton() {
    }
    public static Singleton getInstance(){
        return instance;
    }

}