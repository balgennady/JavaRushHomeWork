package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций
(быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution
{
    public static List  getListForGet()
    {
        //Напишите тут ваш код
        List<Objects> list = new ArrayList();
        return list;

    }

    public static List  getListForSet()
    {
        //Напишите тут ваш код
        List list = new ArrayList();
        return list;
    }

    public static List  getListForAddOrInsert()
    {
        //Напишите тут ваш код
        List list = new LinkedList();
        return list;

    }

    public static List  getListForRemove()
    {
        //Напишите тут ваш код
        List list = new LinkedList();
        return list;


    }
}
