package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
 Пример вывода:
 а 5
 б 8
 в 3
 г 7
 …
 я 9
 */
//public class Solution
//{
//    public static void main(String[] args)  throws Exception
//    {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        //алфавит
//        ArrayList<Character> alphabet = new ArrayList<Character>();
//        for(int i=0;i<32;i++)
//        {
//            alphabet.add( (char) ('а'+i));
//        }
//        alphabet.add(6,'ё');
//
//        //ввод строк
//        ArrayList<String> list = new ArrayList<String>();
//        for(int i=0;i<10;i++)
//        {
//            String s = reader.readLine();
//            list.add(s.toLowerCase());
//        }
//
//        //Напишите тут ваш код
//        for (Character x : alphabet){          //цикл по алфавиту
//            int count=0;                       //начальное значение счётчика в ноль
//            for (String z : list){             //цикл по строкам
//                char[] d = z.toCharArray();    //строку в массив символов
//                for (int n=0; n<d.length; n++) //цикл по массиву символов
//                    if (x==d[n])               //ищем совпадения
//                        count++;               //если совпадае, увеличиваем счетчик
//            }
//            System.out.println(x + " " + count); // вывод результатов
//        }
//    }
//}