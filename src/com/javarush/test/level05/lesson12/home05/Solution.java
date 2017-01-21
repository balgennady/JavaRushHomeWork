package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.channels.Channels;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String sSum = reader.readLine();
        int sum = 0;
        String s;

        while (!"сумма".equals(s = reader.readLine())){
            int sum1 = Integer.parseInt(s);
            sum = sum + sum1;
        }
        System.out.println(sum);
    }
}
