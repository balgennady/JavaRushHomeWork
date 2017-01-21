package com.javarush.test.level09.lesson02.task02;

/**
 * Created by Гена on 17.06.2015.
 */
public class ThreadDemo {

    public static void main(String[] args) {

        function();
    }

    public static void function(){

        new ThreadDemo().function2();
    }

    public void function2() {

        System.out.println(Thread.currentThread().getStackTrace()[3].getClassName());
        System.out.println(Thread.currentThread().getStackTrace()[3].getFileName());
    }
}
