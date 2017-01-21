package com.javarush.test.level14.lesson08.home05;

/**
     5. Создай класс Computer.
     6. В класс Computer добавь приватное поле типа Keyboard.
     7. В класс Computer добавь приватное поле типа Mouse.
     8. В класс Computer добавь приватное поле типа Monitor.
     9. Создай конструктор в классе Computer используя комбинацию клавиш Alt+Insert внутри класса (команда Constructor).
     10 Внутри конструктора инициализируйте все три поля (переменных) класса
     11. Создай геттеры для полей класса Computer (в классе используй комбинацию клавиш Alt+Insert и выбери команду Getter)
 */

public class Computer {
    Keyboard keyboard;
    Mouse mouse;
    Monitor monitor;

    public Computer() {
        keyboard = new Keyboard();
        mouse = new Mouse();
        monitor = new Monitor();
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
