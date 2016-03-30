package com.tz.gof.Singleton;

/**
 * Created by Tz on 2016/3/30.
 * 单件模式很好的匹配了单一职责原则
 * 相对于静态变量，防止了命名空间的污染，因为静态对象也需要一个类来放置
 * 线程池、缓存、日志对象、对话框、打印机、显卡的驱动程序对象常被设计成单例
 */
public class Singleton {
    private volatile static Singleton uniqueInstance; //volatile为检查易变关键字，读取最后的变化值，相对于同一时间只能单线程访问的关键字synchronized效率要高
    private int i = 0;

    private Singleton() {
    }

    /**
     * 获得该单例，lazy instance延迟实例化
     * @return 返回一个Singleton单例
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void showSomething() {
        System.out.println("get method" + ++i);
    }
}
