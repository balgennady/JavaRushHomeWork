package com.javarush.test.level07.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Нужно добавить в программу новую функциональность
Задача:  Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует строки
в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();           //Инициализация списка
        while (true){                                               //Проверка на ввод пувтой строки
            String s = reader.readLine();                           //Запись в переменную строки
            if (s.isEmpty()) break;                                 //выход из цикла при пустой строки
            list.add(s);                                            //добавление строки в список
        }

        /*
        ArrayList<String> listUpperCase = new ArrayList<String>();  //Инициализация списка
        for (int i = 0; i < list.size(); i++){                      //перебор значений листа
            String s1 = list.get(i);                                 //получение i-го элемента листа
            listUpperCase.add(s1.toUpperCase());                     //все символы строки переводит в верхний регистр
        }
        for (int i = 0; i < listUpperCase.size(); i++){             //перебор значений листа
            System.out.println(listUpperCase.get(i));               //печать i-го элемента
        }
        */

        ArrayList<String> listNew = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s1 = list.get(i);
            //целое число чётное, либо (иначе) - нечётное
            int n;
            n =  s1.length();       //возвращает длину строки (количество символов в ней);
            if((n%2)==0){           //todo Если в строке чётное число букв (n)
                String s2 = s1 + " " + s1;
                listNew.add(s2);    //добавление строки в новый список
            }
            else{
                String s2 = s1 + " " + s1 + " " + s1;
                listNew.add(s2);    //добавление строки в новый список
            }
        }
        //вывод на экран
        for (int i = 0; i < listNew.size(); i++){             //перебор значений листа
            System.out.println(listNew.get(i));               //печать i-го элемента
        }
    }
}
