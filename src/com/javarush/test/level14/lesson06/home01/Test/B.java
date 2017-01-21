package com.javarush.test.level14.lesson06.home01.Test;

/**
 * Created by Gennary on 20.07.2015.
 */
public class B extends AA{

    @Override
    int getIntAA() {
        System.out.println(getStringAA());
        return 0;
    }

    @Override
    String getStringAA() {
        return String.format(super.getStringAA() + " Класс-B %s", Test.I.s2);
    }
}
