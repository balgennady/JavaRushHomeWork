package com.javarush.test.level09.lesson11.home04;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Date dt = new Date(br.readLine());
        SimpleDateFormat format = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
        String print = format.format(dt);
        System.out.println(print.substring(0,3).toUpperCase() + print.substring(3));
    }
}
