package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Гена on 16.06.2015.
 */
public class TestData {

    public static void main(String[] args) {
       //Преобразование строки в дату
        String sd = "03.10.2008";

        SimpleDateFormat format = new SimpleDateFormat("MM");//("dd.MM.yyyy")

        try {
            Date date = format.parse(sd);
            System.out.println(date);
                } catch (ParseException ex) {
                    System.out.println("Это не должно произойти");
        }

        //Конвертирование String в Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

        Date    ddd = null;
        String  sss = null;

        try {
            ddd = sdf.parse("2008-10-3");
            sss = ddd.toString();
            System.out.println(sss);
        }catch(Exception e) {        }



    }

}
