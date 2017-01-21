package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/
public class Test {

    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++){
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 2; i++){
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //напишите тут ваш код
//
//        Создание HashMap, содержащий символ в качестве ключа и вхождений в качестве значения
//        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
//        // Конвертирование учитывая строку массив символов
//        for (String str : list){
//            char[] array = str.toCharArray();
//            for (char c : array) {
//                if (hm.containsKey(c)) {
//                    hm.put(c, hm.get(c)+1);
//                } else {
//                    hm.put(c, 1);
//                }
//            }
//        }
//        for (Map.Entry entry :hm.entrySet()) {System.out.println(entry.getKey() + " " + entry.getValue());}


        for (Character x:alphabet){         // цикл по алфавиту
            int count=0;                    // начальное значение счётчика в ноль
            for (String z:list){            //цикл по строкам
                char[] d=z.toCharArray();   // строку в массив символов
                for (int n=0;n<d.length;n++) //цикл по строке
                    if (x==d[n])count++;        //ищем совпадения
            }
            System.out.println(x + " " + count);          //заносим результат в Map
        }

    }
}
