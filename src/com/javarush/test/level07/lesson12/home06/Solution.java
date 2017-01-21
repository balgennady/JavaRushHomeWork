package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс C с полями имя(String), пол(boolean),возраст(int), отец(C), мать(C). Создай объекты и заполни
их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе C, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human GFather = new Human("Павел", true, 72);
        Human Ded2 = new Human("Антон", true, 76);
        Human Baba1 = new Human("Аня", false, 70);
        Human Baba2 = new Human("Света", false, 73);
        Human Father = new Human("Игорь", true, 48, GFather, Baba1);
        Human Mather = new Human("Наташа", false, 45, Ded2, Baba2);
        Human Daughter1 = new Human("Катя", false, 12, Father, Mather);
        Human daughter2 = new Human("Оля", false, 8, Father, Mather);
        Human Son   = new Human("Игорь", true, 2, Father, Mather);

        System.out.println(GFather);
        System.out.println(Ded2);
        System.out.println(Baba1);
        System.out.println(Baba2);
        System.out.println(Father);
        System.out.println(Mather);
        System.out.println(Daughter1);
        System.out.println(daughter2);
        System.out.println(Son);
    }

    public static class Human
    {
        //Написать тут ваш код
        String  name;
        boolean sex;
        int     age;
        Human   father;
        Human   mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
