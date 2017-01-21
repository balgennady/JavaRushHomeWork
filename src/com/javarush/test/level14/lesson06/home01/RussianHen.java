package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Gennary on 20.07.2015.
 */
public class RussianHen extends Hen {

    @Override
    //Метод возвращает количество яиц в месяц от данного типа куриц.
    int getCountOfEggsPerMonth() {
        return 1000;
    }

    // Метод возвращает строку вида: <getDescription() родительского класса>  + <" Моя страна - SSSSS. Я несу N яиц в месяц.">
        // где SSSSS - название страны
        // где N - количество яиц в месяц
    String getDescription(){
        return super.getDescription()
                + " Моя страна - "
                + Country.RUSSIA
                + ". Я несу "
                + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
