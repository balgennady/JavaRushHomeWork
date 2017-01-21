package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a;
        int b;
        int min;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        a = Integer.parseInt(sA);
        b = Integer.parseInt(sB);

        if (a < b)
        {
            min = a;
        } else {
            min = b;
        }
        System.out.println(min);

    }
}