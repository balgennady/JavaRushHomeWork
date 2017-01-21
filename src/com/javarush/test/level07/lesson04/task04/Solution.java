package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int[] num1 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < num1.length; i++) {
            num1[i] = Integer.parseInt(reader.readLine());
        }

        int[] num2 = new int[num1.length];
        int n = num1.length;
        for (int i = 0; i < num2.length; i++) {
            num2[i] = num1[n - 1];
            n = n - 1;
            System.out.println(num2[i]);
        }

    }
}
