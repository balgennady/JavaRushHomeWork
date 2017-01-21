package com.javarush.test.level07.lesson12.bonus03;


import java.util.Arrays;
import java.util.Collections;

/**
 * Метод sort() из класса Arrays использует
 * усовершенствованный алгоритм Быстрой сортировки
 * (Quicksort), который эффективен в большинстве
 * случаев. Для того чтобы отсортировать массив,
 * необходимо написать всего одну строку:
 *  Arrays.sort(arr);// где arr это имя массива
 */
public class SortTest {
    //Создаем массив случайных чисел
    public static Integer arr[] = new Integer[10];

    public static void main(String[] args) {

        for(int i = 0; i <  arr.length; i++) {
            arr[i] =  (int)(Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }

        System.out.print("\nSorted: \n");
        //Сортируем массив
        Arrays.sort(arr, Collections.reverseOrder());
        //Выводим отсортированный массив на консоль.
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
         /*Обратите внимание, что при сортировке массива
        в обратном порядке (по убыванию) нужно использовать
        тип Integer[] вместо примитивного типа int[].*/
    }
}
