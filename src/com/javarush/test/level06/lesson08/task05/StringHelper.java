package com.javarush.test.level06.lesson08.task05;

/* Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s1, int count) – возвращает строку повторенную count раз.
String multiply(String s1) – возвращает строку повторенную 5 раз.
Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

import java.io.BufferedReader;

public class StringHelper {
    public static String multiply(String s) {
        return multiply(s, 5);
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + s;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.print(multiply("gena", 3));
    }
}


