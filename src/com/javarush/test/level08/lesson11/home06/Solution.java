package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс C с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<C>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты C на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        //потомки от первых дедушек и бабушек
        ArrayList<Human> generation1_family1 = new ArrayList<Human>();
        //потомки от других бабушек и дедушек
        ArrayList<Human> generation1_family2 = new ArrayList<Human>();
        //детки
        ArrayList<Human> children = new ArrayList<Human>();

        //создаешь детей
        Human child1 = new Human("Дочь1",   false,  5, new ArrayList<Human>());
        Human child2 = new Human("Дочь2",   false, 10, new ArrayList<Human>());
        Human child3 = new Human("Сын",     true,   1, new ArrayList<Human>());

        //запихиваешь детей в список
        children.add(child1);
        children.add(child2);
        children.add(child3);

        //создаем родителей, впихиваем детей сразу
        Human father = new Human("Папа Коля",   true,   42, children);
        Human mother = new Human("Мама Света",  false,  35, children);

        // после создания родителей запихиваем в коллекцию причем папу в одну, маму в другую
        generation1_family1.add(father);
        generation1_family2.add(mother);

        //создаем дедушку, впихиваем в одного деда папу, в другого деда маму
        Human grandFather1 = new Human("Дедушка Вася", true, 78, generation1_family1);
        Human grandFather2 = new Human("Дедушка Петя", true, 78, generation1_family2);

        //создаем бабушек, впихиваем в одного деда папу, в другого деда маму
        Human grandMother1 = new Human("Бабушка Вера", false, 99, generation1_family1);
        Human grandMother2 = new Human("Бабушка Дуня", false, 125, generation1_family2);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //Написать тут ваш код
        String  name;               //имя (String)
        boolean sex;                //пол (boolean),
        int     age;                //возраст (int),
        ArrayList<Human> children;  //дети (ArrayList<C>)

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
