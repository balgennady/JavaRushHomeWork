package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        Print(name1, name2);

    }

    private static void Print(String name1, String name2) {
        if (name1.equals(name2)){
            System.out.println("Имена идентичны");
        } else {
            if (name1.length() == name2.length()){
                System.out.println("Длины имен равны");
            } else {
                return;
            }
        }
    }
}
