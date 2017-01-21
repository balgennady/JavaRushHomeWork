package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 12 2012".
*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
//        Calendar c = Calendar.getInstance();
//
//        int year = c.get(c.YEAR);
//        int month = c.get(c.MONTH);
//        int date = c.get(c.DATE);
//
//        month++;
//        System.out.println(date + " " + month + " " + year);

        Date d = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd MM yyyy");
        System.out.println(format1.format(d));
    }

}


//    import java.util.Date;
//            import java.text.SimpleDateFormat;
//            import java.util.Calendar;
//
//            import static java.util.Calendar.*;
//
//    public class Solution
//    {
//        public static void main(String[] args)
//        {
//
//            Calendar calendar = Calendar.getInstance();
//            int year = calendar.get(calendar.YEAR);
//            int month = calendar.get(calendar.MONTH)+ 1;
//            int day = calendar.get(calendar.DAY_OF_MONTH);
//            System.out.println(day + " " + month + " " + year);
//
//        }
//    }
