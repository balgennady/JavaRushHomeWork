package com.javarush.test.level12.lesson06.task05;

/* Классы Cat и Dog от Pet
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static abstract class Pet
    {
        public abstract String getName();
        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public String getName(){
            return "name";
        }
        public Pet getChild(){
            Pet cat1 = new Cat();
            return cat1;
        }
    }

    public static class Dog extends Pet {

        public String getName(){
            return "name";
        }
        public Pet getChild(){
            Pet dog1 = new Cat();
            return dog1;
        }

    }

}
