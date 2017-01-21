package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Гена on 16.06.2015.
 */
public class SolutionTEST {


    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        Map<String, String> addresses = new HashMap<String, String>();
        while (true)
        {
            String k = reader.readLine();
            if (k.isEmpty()) break;
            String v = reader.readLine();
            if (v.isEmpty()) break;
            addresses.put(k, v);
            System.out.println( addresses );
        }
        System.out.println( addresses );
        while (true)
        {
            String x = reader.readLine();
            if (x.isEmpty()) break;
            for (Map.Entry entry : addresses.entrySet())
                if ( x.equals( entry.getValue() ) )
                    System.out.println("Key2: " + entry.getKey() );

        }
    }
}
