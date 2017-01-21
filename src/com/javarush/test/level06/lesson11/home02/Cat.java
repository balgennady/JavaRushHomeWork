package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {
    public Cat() {
    }
    //добавь свой код тут (добавь public статическую переменную cats (ArrayList<Cat>))
    public static  ArrayList<Cat> cats = new ArrayList<Cat>();

    public static void main(String[] args) {
        //Create 10 Cat-s1 here - создай 10 котов тут
        for (int i=0; i<10; i++) {
            Cat cat1 = new Cat();
            Cat.cats.add(cat1);
        }
        printCats();
    }

    public static void printCats() {
        //добавь свой код для пункта 3 тут (Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats)
        System.out.println(Cat.cats);
    }
}
