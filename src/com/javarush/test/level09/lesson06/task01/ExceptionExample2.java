package com.javarush.test.level09.lesson06.task01;

/**
 * Created by Гена on 17.06.2015.
 */
public class ExceptionExample2 {

    public static void main(String[] args) {
        System.out.println("Программа стартовала");
        try {
            System.out.println("Обращение до метода 1");
            method1();
            System.out.println("Обращение после метода 1. Never will be shown");
        } catch (Exception e) {
            System.out.println("Исключение было поймано");
        }
        System.out.println("Программа по-прежнему работает");
    }

    public static void method1() {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }
}
