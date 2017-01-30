package com.javarush.test.level15.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print.
    Если значение:
        2.1. содержит точку '.', то вызвать метод print для Double;
        2.2. больше нуля, но меньше 128, то вызвать метод print для short;
        2.3. больше либо равно 128, то вызвать метод print для Integer;
        2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true) {

            String text = br.readLine();

            if (text.equals("exit")) break;

            if (text.matches("^-?\\d+$")) {
                int i = Integer.parseInt(text);
                if (i>0 & i<128) {
                    short sh = (short) i;
                    print(sh);
                } else {
                    Integer in = i;
                    print(in);
                }
            } else if (text.matches("\\-?\\d+(\\.?\\d+)?")) {
                double dou = Double.parseDouble(text);
                print(dou);}
            else {
                print(text);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }

    public static void pr(String in){
        System.out.println(in);
    }
}