package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его,
полученное с помощью StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        //System.out.println(meth);   //можно отовсюду поубирать, ибо по условию ничего выводить не нужно.
        return meth;
    }

    public static String method2()
    {
        method3();
        //Напишите тут ваш код

        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        //System.out.println(meth);   //можно отовсюду поубирать, ибо по условию ничего выводить не нужно.
        return meth;
        //return Thread.currentThread().getStackTrace()[2].getLineNumber();

//        в каждом методе может быть заменена на более короткую
//        return Thread.currentThread().getStackTrace()[2].getLineNumber()

    }

    public static String method3()
    {
        method4();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        //System.out.println(meth);   //можно отовсюду поубирать, ибо по условию ничего выводить не нужно.
        return meth;
    }

    public static String method4()
    {
        method5();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth0 = stackTraceElement[0].getMethodName();// 0 получается свой собственный getStackTrace
        String meth1 = stackTraceElement[1].getMethodName();// 1 имя собственного метода
        String meth2 = stackTraceElement[2].getMethodName();// 2 имя метода, который вызвал
        String meth3 = stackTraceElement[9].getMethodName();// 3 тогда будет метод, который вызвал метод 2
        int meth4 = stackTraceElement.length;// 3 тогда будет метод, который вызвал метод 2
        System.out.println(meth0);   //можно отовсюду поубирать, ибо по условию ничего выводить не нужно.
        System.out.println(meth1);   //можно отовсюду поубирать, ибо по условию ничего выводить не нужно.
        System.out.println(meth2);   //можно отовсюду поубирать, ибо по условию ничего выводить не нужно.
        System.out.println(meth3);   //можно отовсюду поубирать, ибо по условию ничего выводить не нужно.
        System.out.println(meth4);   //можно отовсюду поубирать, ибо по условию ничего выводить не нужно.
        return meth1;
    }

    public static String method5()
    {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        //System.out.println(meth);   //можно отовсюду поубирать, ибо по условию ничего выводить не нужно.
        return meth;
    }
}
