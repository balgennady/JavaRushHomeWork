package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        //Написать тут ваш код. step 3 - пункт 3

        Iterator<Cat> iterator = cats.iterator();
        cats.remove(iterator.next());
        printCats(cats);

    }

    public static Set<Cat> createCats()
    {
        //Написать тут ваш код. step 2 - пункт 2

        Set<Cat> cats = new HashSet<Cat>();  //создал множество
        Cat cat = new Cat();  //создал объекты-котов
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cats.add(cat); // добавил объекты в множество
        cats.add(cat1);
        cats.add(cat2);
        return cats;
    }

    public static void printCats(Set<Cat> cats)
    {
        // step 4 - пункт 4

        for (Cat p : cats)
        {
            System.out.println(p);
        }
    }

    // step 1 - пункт 1

    public static class Cat {

    }
}