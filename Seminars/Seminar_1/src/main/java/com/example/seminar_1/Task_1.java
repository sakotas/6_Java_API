package com.example.seminar_1;

import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        /*
         * Написать программу, которая будет генерить случайное число
         * Потом перевернет его
         * */
        int random = new Random().nextInt(1000, 10000);
        System.out.println(random);
        String[] str_random = String.valueOf(random).split("");
        String[] tmp_arr = str_random.clone();
        System.out.println(Arrays.toString(str_random));

        for (int i = 0; i < tmp_arr.length; i++) {
            tmp_arr[i] = str_random[str_random.length - 1 - i];
        }


        for (int i = 0; i < tmp_arr.length; i++) {
            System.out.print(tmp_arr[i]);
        }
        System.out.println();

        /*
        * Сделайте строку, напишите Иванов Иван Иванович
        * Вывести "Иванов И. И."
        * */

        String s = "Иванов Иван Иванович";
        System.out.println(s);
        String[] s_array = s.split(" ");
        String[] new_s = s_array.clone();

        for (int i = 1; i < new_s.length; i++) {
            new_s[i] = new_s[i].split("")[0] + ".";
        }

        System.out.println(Arrays.toString(s_array));
        System.out.println(Arrays.toString(new_s));
        System.out.println(new_s[0] + " " + new_s[1] + " " + new_s[2]);

    }
}
