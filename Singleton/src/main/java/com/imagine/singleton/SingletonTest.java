package com.imagine.singleton;

/**
 * @author imagine
 * @date 2023/7/10/0010 - 16:10
 * 单例那么肯定就是只有一个实例对象，在我们的整个程序中，同一个类始终只会有一个对象来进行操作。
 * 比如数据库连接类，实际上我们只需要创建一个对象或是直接使用静态方法就可以了，没必要去创建多个对象。
 */
public class SingletonTest {
    public static void main(String[] args) {
        Hungry instance1 = Hungry.getInstance();
        Hungry instance2 = Hungry.getInstance();
        System.out.println(instance1 == instance2);

    }
}

/**
 * 单例模式懒汉式
 * 私有化构造器（没办法通过new创建对象）
 * 定义一个静态的不可变的属性直接实例化
 * 静态方法获取该对象
 */
class Hungry {
    //直接实例化对象
    private final static Hungry instance = new Hungry();

    //私有化构造器
    private Hungry() {
    }

    //提供外部获取对象的方法
    public static Hungry getInstance() {
        return instance;
    }

}

/**
 * 懒汉式
 * 双重锁版
 */
class Lazy {
    private static volatile Lazy instance;

    private Lazy() {

    }

    public static Lazy getInstance() {
        if (instance == null) {
            synchronized (Lazy.class) {
                if (instance == null) {
                    instance = new Lazy();
                }
            }
        }
        return instance;
    }
}