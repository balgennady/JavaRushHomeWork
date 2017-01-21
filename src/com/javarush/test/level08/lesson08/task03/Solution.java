package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap <String, String> map = new HashMap<String, String>();

        map.put("familiya1", "name");
        map.put("familiya2", "name");
        map.put("familiya3", "name");
        map.put("familiya4", "name");
        map.put("familiya5", "name");
        map.put("familiya6", "name");
        map.put("familiya7", "name");
        map.put("familiya8", "name");
        map.put("familiya9", "name");
        map.put("familiya10", "name");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        int getCount = 0;
        String value;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            value = pair.getValue();
            if(value.equals(name)) getCount++ ;
        }
        return getCount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код.
        int getCount = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getKey();
            if(value.equals(familiya)) getCount++ ;
        }
        return getCount;

    }



}
