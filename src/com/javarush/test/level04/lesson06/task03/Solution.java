package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.util.Scanner;

public class Solution   {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        int d = sc.nextInt();
        int t = sc.nextInt();
        Reverse(o, d, t);
    }

    public static void Reverse(int a, int b, int c) {
        int tmp;
        if (a < b) {tmp = a; a = b; b = tmp;}
        if (a < c) {tmp = a; a = c; c = tmp;}
        if (b < c) {tmp = b; b = c; c = tmp;}
        System.out.println(a + " " + b + " " + c);
    }

}