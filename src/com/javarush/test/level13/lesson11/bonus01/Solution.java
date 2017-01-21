package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        //Открываем поток, считывающий имя файла.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        //Открываем исходящий поток в указанное имя файла
        BufferedReader inputStream = new BufferedReader(new FileReader(fileName));

        List<Integer> list = new ArrayList<>();

        while (inputStream.ready()) {
            //Считываем строку
            int i = Integer.parseInt(inputStream.readLine());
            //записываем в массив данные преобразовав в числа
            if (i%2==0) list.add(i);
        }

        Collections.sort(list);

        for (int i : list) System.out.println(i);


        //закрываем потоки
        inputStream.close();

    }
}
