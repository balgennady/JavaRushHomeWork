package com.javarush.test.level09.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/
//todo FileInputStream
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        java.io.FileInputStream fileInputStream = null;
        String destinationFileName = reader.readLine();
        try {
            String sourceFileName = reader.readLine();
            fileInputStream = new java.io.FileInputStream(sourceFileName);
        } catch (FileNotFoundException e) {
            System.out.println("not");

            //String sourceFileName = reader.readLine();

        }
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(destinationFileName);

        int count = 0;
        while (fileInputStream.available()>0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
