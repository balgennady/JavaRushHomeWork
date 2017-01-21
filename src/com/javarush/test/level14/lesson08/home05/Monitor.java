package com.javarush.test.level14.lesson08.home05;

/**
 * 3. Создай классы Keyboard, Mouse, Monitor, которые реализуют интерфейс CompItem.
   4. Метод getBookName() должен возвращать имя класса, например, для класса Keyboard будет "Keyboard".
 */
public class Monitor implements CompItem {
    String name = "Monitor";

    @Override
    public String getName() {
        return name;
    }
}
