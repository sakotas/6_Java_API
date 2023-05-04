package com.learn.seminar_2;

import java.util.*;

public class Seminar_5 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Пять", "Five");
        map.put("Два", "Two");
        map.put("Один", "One");

        System.out.println(map);
        print_div();

        System.out.println(map.get("Пять"));
        print_div();

        System.out.println(map.remove("Пять", "Five"));
        print_div();

        System.out.println(map);
        print_div();
        map.put("Пять", "Five");

        map.keySet();

        for (String key : map.keySet()) {
            System.out.println(map.get(key));

        }

        print_div();

        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(map.get(key));
        }

        print_div();

        Set keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(map.get(keys.toArray()[i]));
        }

        print_div();

        System.out.println(map.getOrDefault("Шесть", "0"));
        System.out.println(map.containsKey("Шесть"));
        System.out.println(map.containsValue("Five"));
        System.out.println(map.putIfAbsent("Шесть", "Six"));
        System.out.println(map);
        print_div();
        map.forEach((k, v) -> System.out.println(k + " " + v));

        for (String key : map.keySet()) {
            map.compute(key, (k, v) -> v + "!");
        }

        System.out.println(map);
        print_div();

        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("Пять", "Five");
        hashMap.put("Два", "Two");
        hashMap.put("Один", "One");
        hashMap.putIfAbsent("Шесть", "6");

        System.out.println(hashMap);
        print_div();

        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        treeMap.put(5, "Five");
        treeMap.put(2, "Two");
        treeMap.put(1, "One");
        treeMap.putIfAbsent(6, "6");
        System.out.println(treeMap);
        System.out.println(treeMap.headMap(2));
        print_div();


    }

    private static void print_div() {
        System.out.println("-".repeat(30));
    }

}
