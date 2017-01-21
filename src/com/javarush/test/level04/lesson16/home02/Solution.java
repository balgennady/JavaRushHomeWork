package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a > b && a > c) {   //a max
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        } else if (b > a && b > c) { //b max
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if (a > b) {
            System.out.println(a);
        } else  {
            System.out.println(b);
        }

    }
}
