package com.example.homework_1;

import java.util.*;

public class Homework_3 {

    public static void main(String[] args) {
//        1. Реализовать алгоритм обратной сортировки списков компаратором.
        System.out.println("1. Реализовать алгоритм обратной сортировки списков компаратором.");
        ArrayList<Integer> list_1 = formArrayWithRandomTen(new ArrayList<Integer>(), 10, 25);

        System.out.println(list_1);

        list_1.sort(new Comparator<Integer>() { // Обратная сортировка с использованием компоратора
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(list_1);
        print_divider();

//        2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
        System.out.println("2. Пусть дан произвольный список целых чисел, удалить из него чётные числа");
        ArrayList<Integer> list_2 = formArrayWithRandomTen(new ArrayList<Integer>(), 10, 25);

        System.out.println(list_2);

        for (int i = 0; i < list_2.size(); i++) { // Проходим циклом по всему list_2
            if (list_2.get(i) % 2 == 0) {
                list_2.remove(i);                  // Если остаток от деления значения i равен нулю, то удаляем значение
            }
        }

        System.out.println(list_2);
        print_divider();

//        3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        System.out.println("3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.");
        ArrayList<Integer> list_3 = formArrayWithRandomTen(new ArrayList<Integer>(), 10, 25);

        System.out.println(list_3);

        Integer max = Collections.max(list_3);
        Integer min = Collections.min(list_3);
        Integer avg = calculateAverage(list_3);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        System.out.println("Average value: " + avg);

        print_divider();

//        4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
        System.out.println("4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.");
        ArrayList<Integer> list_4_1 = formArrayWithRandomTen(new ArrayList<Integer>(), 10, 25);
        ArrayList<Integer> list_4_2 = formArrayWithRandomTen(new ArrayList<Integer>(), 10, 25);
        System.out.println("list_4_1: " + list_4_1);
        System.out.println("list_4_2: " + list_4_2);

        list_4_2.removeAll(list_4_1);
        list_4_1.addAll(list_4_2);
        System.out.println(list_4_1);

        print_divider();


//        5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
        System.out.println("5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.");
        ArrayList<Integer> arrayList = new ArrayList<>();

        long beginArrayList = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0);
        }
        long endArrayList = System.nanoTime();
        long resultArrayList = endArrayList - beginArrayList;
        System.out.println("Создан ArrayList с 10 000 нулями");
        print_divider();

//        6. Повторить пятый пункт но с LinkedList.
        System.out.println("6. Повторить пятый пункт но с LinkedList.");

        LinkedList<Integer> linkedList = new LinkedList<>();

        long beginLinkedList = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0);
        }
        long endLinkedList = System.nanoTime();
        long resultLinkedList =  endLinkedList - beginLinkedList;
        System.out.println("Создан LinkedList с 10 000 нулями");
        print_divider();

//        7. Сравнить время работы пятого и шестого пунктов.
        System.out.println("7. Сравнить время работы пятого и шестого пунктов.");
        System.out.println("Время работы ArrayList: " + resultArrayList);
        System.out.println("Время работы LinkedList: " + resultLinkedList);
        print_divider();


    }

    private static void print_divider() {
        System.out.println("-".repeat(45));
    }

    private static int calculateAverage(List <Integer> inArray) {
        int sum = 0;
        for (int i=0; i< inArray.size(); i++) {
            sum += i;
        }
        return sum / inArray.size();
    }

    private static ArrayList<Integer> formArrayWithRandomTen(ArrayList<Integer> inArray, int length, int bound){
        for (int i = 0; i < length; i++) {
            inArray.add(new Random().nextInt(bound));
        }
        return inArray;
    }

}
