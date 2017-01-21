package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int max;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        String sD = reader.readLine();
        a = Integer.parseInt(sA);
        b = Integer.parseInt(sB);
        c = Integer.parseInt(sC);
        d = Integer.parseInt(sD);


        if (a > b && a > c && a > d) {max = a;}
        else if (b > a && b > c && b > d) {max = b;}
        else if (c > a && c > b && c > d) {max = c;}
        else {max = d;}

        System.out.println(max);

    }
}
