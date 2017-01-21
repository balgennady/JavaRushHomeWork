package com.javarush.test.level14.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Коты
1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
2. Каждый параметр соответствует имени кота.
Для каждого параметра:
3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
4. Вывести на экран cat.toString().
*/

public class  Solution {
//todo CatFactory
    public static void main(String[] args) throws Exception {
        //Add your code here

        //Открываем поток, считывающий имя.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            //Считываем строку
            String catName = reader.readLine();

            //если строка содержит exit, то записываем эту строку в файл и закрываем цикл
            if (catName.equals("")) {
                break;
            }
            //иначе (строка) - Создатаем объект cat класса Cat
            //который равен коту из getCatByKey(String параметр)
            else {
                //CatFactory.getCatByKey(catName);
                Cat cat = CatFactory.getCatByKey(catName);
                //Вывести на экран cat.toString().
                System.out.println(cat.toString());
            }
        }
    }

    static class CatFactory {

        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }

            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString()
        {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString()
        {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name)
        {
            super(name);
        }

        public String toString()
        {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
