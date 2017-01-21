package com.javarush.test.level10.lesson11.home05;

import java.util.ArrayList;

/**
 * Created by bal_g on 29.06.2015.
 */
public class Test2 {
    public static void main(String args[]){

        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<5; i++){
            list.add("номер "+i);
        }
        System.out.println("Размер List: " + list.size());

        list.remove(1);
        System.out.println("Размер List: " + list.size());

        for(int i=0; i<list.size(); i++){
            //if(list.get(i).equals("номер 2"))
            System.out.println(list.get(i));
        }
    }
}
