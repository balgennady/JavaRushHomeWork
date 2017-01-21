package com.javarush.test.level09.lesson11.home05;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Solution
//{
//    public static void main(String[] args) throws Exception
//    {
//        //Написать тут ваш код
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String text = br.readLine();
//
//        char[] tectChar = text.toCharArray();
//        String s1 = "";
//        String s2 = "";
//        for(char c : tectChar){
//            //System.out.println("character: " + ch);
//            if(isVowel(c)){
//                String s = new String(String.valueOf(c));
//                s1 = s1 + s + " ";
//            }else{
//                if (!(c == ' ')){
//                    String s = new String(String.valueOf(c));
//                    s2 = s2 + s + " ";
//                }
//            }
//        }
//        System.out.println(s1);
//        System.out.println(s2);
//
//    }
//
//
//    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
//
//    //метод проверяет, гласная ли буква
//    public static boolean isVowel(char c)
//    {
//        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам
//
//        for (char d : vowels)   //ищем среди массива гласных
//        {
//            if (c == d)
//                return true;
//        }
//        return false;
//    }
//}
