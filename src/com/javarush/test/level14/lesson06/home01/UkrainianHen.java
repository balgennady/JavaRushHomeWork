package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Gennary on 20.07.2015.
 */
public class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 2000;
    }

    String getDescription(){
        return super.getDescription()
                + " Моя страна - "
                + Country.UKRAINE
                + ". Я несу "
                + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
