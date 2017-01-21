package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Cat
{
    String name = null;
    int wight;
    int age;
    String color;
    String addres = null;

    //name
    public void initialize(String name) {
        this.name = name;
        this.wight = 4;
        this.age = 3;
        this.color = "black";
    }

    //Имя, вес, возраст
    public void initialize(String name, int wight, int age) {
        this.name = name;
        this.wight = wight;
        this.age = age;
        this.color = "black";
    }

    //Имя, возраст (вес стандартный)
    public void initialize(String name, int age) {
        this.name = name;
        this.wight = 4;
        this.age = age;
        this.color = "black";
    }

    //вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
    public void initialize(int wight, String color) {
        this.wight = wight;
        this.age = 3;
        this.color = color;
    }

    //вес, цвет, адрес ( чужой домашний кот)
    public void initialize(int wight, String color, String addres) {
        this.wight = wight;
        this.age = 3;
        this.color = color;
        this.addres = addres;
    }




}
