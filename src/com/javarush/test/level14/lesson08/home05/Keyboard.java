package com.javarush.test.level14.lesson08.home05;

/**
 3. Создай классы Keyboard, которые реализуют интерфейс CompItem.
 4. Метод getBookName() должен возвращать имя класса.
 */
public class Keyboard implements CompItem{
    String name = "Keyboard";

    @Override
    public String getName() {
        return name;
    }
}
