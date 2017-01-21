package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum ;
        int  minimum ;

        //Напишите тут ваш код
        int[] mas = new int[20];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        maximum = mas[0];
        minimum = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > maximum) {
                maximum = mas[i];
            }
            else if(minimum > mas[i]) {
                minimum = mas[i];
            }
        }

        System.out.print(maximum);
        System.out.print(" ");
        System.out.println(minimum);
    }
}
