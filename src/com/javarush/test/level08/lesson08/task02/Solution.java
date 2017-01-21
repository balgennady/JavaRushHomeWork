package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //Напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < 20; i++)
            set.add(i + 3);

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set){
        //Напишите тут ваш код

//      for (Integer num : set) if (num > 10){set.remove(num);}
//      return set;

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            int a = iterator.next();
            if (a > 10)
                iterator.remove();
        }
        return set;
    }

}
