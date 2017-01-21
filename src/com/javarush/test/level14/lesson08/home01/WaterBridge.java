package com.javarush.test.level14.lesson08.home01;

/**
 * Создать классы WaterBridge, которые реализуют интерфейс Bridge.
 */
public class WaterBridge implements Bridge{
    @Override
    public int getCarsCount() {
        return 10;
    }
}
