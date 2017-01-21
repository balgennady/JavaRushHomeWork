package com.javarush.test.level14.lesson06.home01;

/**
 * 1.2. Добавить в класс абстрактный метод  int getCountOfEggsPerMonth()
 */
public abstract class Hen {
    abstract int getCountOfEggsPerMonth();
    //метод String getDescription(), возвращает строку "Я курица."
    String getDescription(){
        return "Я курица.";
    }
}
