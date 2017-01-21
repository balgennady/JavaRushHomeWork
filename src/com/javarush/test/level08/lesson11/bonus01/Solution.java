package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here - напиши код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date1 = reader.readLine();
        String date = date1 + " 1 2015";
        System.out.println(date1 + " is "+isDateOdd(date)+" month");
    }

    public static long isDateOdd(String date)
    {
        Date then = new Date(date);
        Date now = new Date(then.getYear(),-1,0);
        long difference = (then.getTime() - now.getTime())/24/60/60/1000/30;
        //System.out.println(difference);
        return difference;//difference;
    }


}
