package com.javarush.test.level12.lesson09.task05;

/* Класс C и интерфейсы Run, Swim
Напиши public класс C(человек) и  public интерфейсы Run(бежать/ездить), Swim(плавать).
Добавь в каждый интерфейс по одному методу.
Добавь эти интерфейсы классу C, но не реализуй методы.
Объяви класс C абстрактным.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    //add public interfaces and public class here - добавь public интерфейсы и public класс тут
    public interface Run{
        public void run();
    }

    public interface Swim{
        public void swim();
    }

    public abstract class Human implements Run, Swim {

    }
}
