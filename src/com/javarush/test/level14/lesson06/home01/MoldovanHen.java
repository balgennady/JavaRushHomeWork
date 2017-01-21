package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Gennary on 20.07.2015.
 */
public class MoldovanHen extends Hen{

    @Override
    int getCountOfEggsPerMonth() {
        return 3000;
    }

    String getDescription(){
        return super.getDescription()
                + " Моя страна - "
                + Country.MOLDOVA
                + ". Я несу "
                + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
