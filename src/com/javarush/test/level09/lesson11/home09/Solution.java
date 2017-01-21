package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //Напишите тут ваш код

        HashMap<String, Cat> hmap = new HashMap<String, Cat>();
        hmap.put("Kat1", new Cat("Kat1"));
        hmap.put("Kat2", new Cat("Kat2"));
        hmap.put("Kat3", new Cat("Kat3"));
        hmap.put("Kat4", new Cat("Kat4"));
        hmap.put("Kat5", new Cat("Kat1"));
        hmap.put("Kat6", new Cat("Kat1"));
        hmap.put("Kat7", new Cat("Kat1"));
        hmap.put("Kat8", new Cat("Kat1"));
        hmap.put("Kat9", new Cat("Kat1"));
        hmap.put("Kat10", new Cat("Kat1"));

        return hmap;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //Напишите тут ваш код

        HashSet<Cat> set = new HashSet<Cat>();
        set.addAll(map.values());
//        for(Cat icat : map)
//            set.add(icat);
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
