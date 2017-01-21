package com.javarush.test.level05.lesson12.home02;

/* A and B
1. Внутри класса Solution создай public static классы A и B.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man men1 = new Man("Ivan", 20, "Ivanovo" );
        Man men2 = new Man("Vanja",21, "donezk");
        Woman woman1 = new Woman("Ina", 17, "dnepr");
        Woman woman2 = new Woman("lena", 18, "kipr");

        System.out.println(men1.name + " " + men1.age + " " + men1.address);
        System.out.println(men2.name + " " + men2.age + " " + men2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {

        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {

        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
