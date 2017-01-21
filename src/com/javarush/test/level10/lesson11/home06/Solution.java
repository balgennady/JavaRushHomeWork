package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса C
Напиши класс C с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        String surname;
        int age;
        int weight;
        boolean sex = true;
        int height;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, boolean sex) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
        }

        public Human(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, int age, int weight) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, String surname, int age, int weight, boolean sex) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, String surname, int age, int weight, boolean sex, int height) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.height = height;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(int weight, boolean sex, int height) {
            this.weight = weight;
            this.sex = sex;
            this.height = height;
        }

        public Human(boolean sex, int height) {
            this.sex = sex;
            this.height = height;
        }
    }
}
