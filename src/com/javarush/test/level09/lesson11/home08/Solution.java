package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //Написать тут ваш код

        ArrayList<int[]> result = new ArrayList<int[]>();

        int[] arr1 = new int[5];
        int[] arr2 = new int[2];
        int[] arr3 = new int[4];
        int[] arr4 = new int[7];
        int[] arr5 = new int[0];

        result.add(arr1);
        result.add(arr2);
        result.add(arr3);
        result.add(arr4);
        result.add(arr5);

        return result;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
