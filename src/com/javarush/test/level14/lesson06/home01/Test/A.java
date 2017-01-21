package com.javarush.test.level14.lesson06.home01.Test;

class A extends AA {

    @Override
    int getIntAA() {
        System.out.println(getStringAA());
        return 0;
    }

    @Override
    String getStringAA() {
        return String.format(super.getStringAA() + " Класс-А %s1", Test.I.s1);
    }
}
