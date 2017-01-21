package com.javarush.test.level14.lesson08.bonus03;

/**
 * todo Singleton
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
/*
public class Singleton {
    private Singleton(){}
    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
*/

/*
public enum SingletonEnum {
    INSTANCE;
    public void someMethod() {
        ***
    }
    public void anotherMethod() {
        ***
    }
}
*/

