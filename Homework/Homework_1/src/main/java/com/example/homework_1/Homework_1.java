package com.example.homework_1;

import java.util.ArrayList;
import java.util.Random;

public class Homework_1 {
    //        Пункты реализовать в методе main
    //        * Пункты реализовать в разных методах
    //        Первый семинар.
    //        int i = new Random().nextInt(k); //это кидалка случайных чисел!)

    public static void main(String[] args) {
        startProgram();
    }

    private static void startProgram() {
        Integer i = getRandomNumber();
        int n = getByteValue(i);
        System.out.println(getFirstArray(i, n));
        System.out.println(getSecondArray(i, n));
    }

    private static int getRandomNumber() {
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        Integer i = new Random().nextInt(1000, 2000);
        System.out.println(i);
        return i;
    }

    private static int getByteValue(Integer i) {
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = i.byteValue();
        System.out.println(n);
        return n;
    }

    private static ArrayList getFirstArray(Integer i, int n) {
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        ArrayList m1 = new ArrayList();
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1.add(j);
            }
        }
        System.out.println(m1);
        return m1;
    }

    private static ArrayList getSecondArray(Integer i, int n) {
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        ArrayList m2 = new ArrayList<>();
        for (int k = Short.MIN_VALUE; k < i; k++) {
            if (k % n != 0) {
                m2.add(k);
            }
        }
        System.out.println(m2);
        return m2;
    }

}
