package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name;
    private int age;
    private int wight;
    private String address;
    private String color;

    public Cat(String name) {
        this.name = name;
        this.wight = 3;
        this.age = 3;
    }

    //Имя, вес, возраст
    public Cat(String name, int weight, int age) {
        this.name = name;
        this.wight = weight;
        this.age = age;
    }

    //Имя, возраст (вес стандартный)
    public Cat(String name, int age) {
        this.name = name;
        this.wight = 3;
        this.age = age;
    }

    //вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
    public Cat(int weight, String color) {
        this.wight = weight;
        this.age = 3;
        this.color = color;
    }

    //вес, цвет, адрес ( чужой домашний кот)
    public Cat(int weight, String color, String address) {
        this.wight = weight;
        this.age = 3;
        this.color = color;
        this.address = address;
    }
}
