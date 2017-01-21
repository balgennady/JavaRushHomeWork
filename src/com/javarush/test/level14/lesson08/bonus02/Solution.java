package com.javarush.test.level14.lesson08.bonus02;

/*todo НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(reader.readLine());
        int x2 = Integer.parseInt(reader.readLine());
        while (x2 != 0) {
            int tmp = x1 % x2;
            x1 = x2;
            x2 = tmp;
        }
        System.out.println(x1);

    }
}
