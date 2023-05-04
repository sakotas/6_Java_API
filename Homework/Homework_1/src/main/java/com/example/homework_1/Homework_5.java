package com.example.homework_1;

import java.util.HashMap;
import java.util.Map;

public class Homework_5 {

    public static void main(String[] args) {
//        Создать множество, ключь и значение строки.
        Map<String, String> map1 = new HashMap<>();

//        Добавить шесть элементов.
        map1.put("Пять", "Five");
        map1.put("Два", "Two");
        map1.put("Один", "One");
        map1.put("Четыре", "Four");
        map1.put("Три", "Three");

//        Вывести в консоль значения.
        for (String key : map1.keySet()) {
            System.out.println(key + " - " + map1.get(key));
        }
        print_div();

//        Добавить ко всем значениям символ "!".
        for (String key : map1.keySet()) {
            map1.compute(key, (k, v) -> v + "!");
        }
        System.out.println(map1);
        print_div();

//        Создать второе множество с таким же обобщением.
        Map<String, String> map2 = new HashMap<>();

//        Ключи второго множества частично совпадают с ключеми первого.
        map2.put("Пять", "Five");
        map2.put("Семь", "Seven");
        map2.put("Один", "One");
        map2.put("Шесть", "Six");
        map2.put("Три", "Three");

//        Объеденить значания во втором множестве и первом если ключи совподают.
        HashMap<String, String> map1_map2 = new HashMap<>();
        for(String key: map1.keySet()){
            if (map2.containsKey(key)){
                map1_map2.put(key,map1.get(key));
                map1_map2.merge(key, "(" + map2.get(key) +")", String::concat);
            }
        }
//        Вывести результат в консоль.
        System.out.println(map1_map2);
    }

    private static void print_div() {
        System.out.println("-".repeat(30));
    }

}
