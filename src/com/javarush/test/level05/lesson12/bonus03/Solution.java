package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        int N = Integer.parseInt(reader.readLine());
        int buf = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N - 1; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (a > buf){
              buf = a;
            }
        }
        maximum = buf;

        System.out.println(maximum);

    }
}
