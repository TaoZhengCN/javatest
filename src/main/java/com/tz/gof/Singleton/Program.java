package com.tz.gof.Singleton;

/**
 * Created by Tz on 2016/3/30.
 */
public class Program {
    public static void main(String[] args)
    {
        Singleton single =  Singleton.getInstance();
        single.showSomething();
        Singleton single2 = Singleton.getInstance();
        single2.showSomething();
    }
}
