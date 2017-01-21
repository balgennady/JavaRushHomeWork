package com.javarush.test.level09.lesson02.task04;

/* Стек-трейс длиной 10 вызовов
Напиши код, чтобы получить стек-трейс длиной 10 вызовов.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        return method2();
    }

    public static StackTraceElement[] method2()
    {
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String method = stackTraceElement[1].getMethodName();
        String method2 = stackTraceElement[2].getMethodName();
        String method3 = stackTraceElement[3].getMethodName();
        System.out.println(method);
        System.out.println(method2);
        System.out.println(method3);
        return method3();

    }

    public static StackTraceElement[] method3()
    {
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String method = stackTraceElement[1].getMethodName();
        System.out.println(method);
        return method4();

    }

    public static StackTraceElement[] method4()
    {
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String method = stackTraceElement[1].getMethodName();
        System.out.println(method);
        return method5();

    }

    public static StackTraceElement[] method5()
    {
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String method = stackTraceElement[1].getMethodName();
        System.out.println(method);
        return method6();

    }

    public static StackTraceElement[] method6()
    {
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String method = stackTraceElement[1].getMethodName();
        System.out.println(method);
        return method7();

    }

    public static StackTraceElement[] method7()
    {
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String method = stackTraceElement[1].getMethodName();
        System.out.println(method);
        return method8();

    }

    public static StackTraceElement[] method8()
    {
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String method = stackTraceElement[1].getMethodName();
        System.out.println(method);
        return method9();

    }

    public static StackTraceElement[] method9()
    {
        return method10();
    }

    public static StackTraceElement[] method10()
    {
        return Thread.currentThread().getStackTrace();
    }
}
