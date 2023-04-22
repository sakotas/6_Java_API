package com.learn.seminar_2;

import java.util.*;

public class Seminar_3 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

//        list.add(1);
//        list.add(.1);
//        list.add(.1f);
        list.add("One");
        list.add("Два");
        list.add(1, "Три");
        list.add("Квас");
        list.add("Ал");
        list.add("Кора");
        list.add("Пирог");
        list.add("Слон");

//        System.out.println(list);
//        list.remove(2);
        System.out.println(list);
        String a = list.get(0);
        System.out.println(a);
        System.out.println("-".repeat(30));

        ArrayList<Integer> listI1 = new ArrayList<>();
        ArrayList<Integer> listI2 = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            listI1.add(new Random().nextInt(25));
            listI2.add(new Random().nextInt(25));
        }

        System.out.println(listI1);
        System.out.println(listI2);
        System.out.println("-".repeat(30));
        listI1.removeAll(listI2);
        listI1.addAll(listI1);
        listI1.retainAll(listI2);
        System.out.println(listI1);

        final int f = 6;

        if (listI2.contains(45)) System.out.println("true");
        List<Integer> listI3 = listI2.subList(0, 3);
        System.out.println(listI3);
        listI3 = (List<Integer>) listI2.clone();
        System.out.println(listI3);
        listI3.clear();
//        listI2.sort(Comparator.naturalOrder());
        System.out.println(listI2);

        listI2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 != 0) return 1;
                if (o2 % 2 != 0) return 0;
                return -1;
            }
        });

        System.out.println(listI2);

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(3);

        System.out.println(Arrays.toString(new int[]{3, 4, 5}));
        Fio fio = new Fio("Иванов", "Иван", "Иванович");
        System.out.println(fio);

        //        for (int i = 0; i < listI1.size(); i++) {
//            System.out.println(listI1.get(i));
//        }
//
//        for (int n: listI1) {
//            System.out.println(n);
//        }

//        listI1.forEach(n -> System.out.println(n));

//        Iterator<Integer> iterator = listI1.iterator();

//        while (iterator.hasNext()){
//            int n = iterator.next();
//            System.out.print(n+", ");
//            iterator.remove();
//        }

//        System.out.println(listI1);

//        list.add(true);

//        if (list.get(0) instanceof Integer){
//            int a = ((Integer)list.get(0)).byteValue();
//
//        }

//        String[] strings = new String[10];

    }
}

class Fio {
    private String f, i, o;

    public Fio(String f, String i, String o) {
        this.f = f;
        this.i = i;
        this.o = o;
    }

    @Override
    public String toString() {
        return f + " " + i.toUpperCase().charAt(0) + "." + o.toUpperCase().charAt(0) + ".";
    }
}

