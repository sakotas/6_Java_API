package com.learn.seminar_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Seminar_4 {

    String PATH = "ddfsab";

    FileReader fr;

    {
        try {
            fr = new FileReader(PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //  Иванов Иван Иванович 18 М
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<String> family_names = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> second_names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> genders = new ArrayList<>();


        while (scanner.hasNext()) {
            int i = ids.size();
            String next = scanner.nextLine();
            list.add(next);
            String[] temp = next.split(" ");
            ids.add(i);
            family_names.add(temp[0]);
            names.add(temp[1]);
            second_names.add(temp[2]);
            ages.add(Integer.parseInt(temp[3]));
            genders.add(temp[4]);
        }

        System.out.println(ids);
        System.out.println(family_names);
        System.out.println(names);
        System.out.println(second_names);
        System.out.println(ages);
        System.out.println(genders);
        System.out.println(list);

        ArrayList<Integer> order = new ArrayList<>(ids);

        int temp = 0;
        boolean isSorted = true;

        while (isSorted) {

            for (int i = 0; i < ages.size() - 1; i++) {
                isSorted = false;
                if (ages.get(i) <= ages.get(i + 1)) {
                    temp = ages.get(i);
                    ages.set(i, ages.get(i + 1));
                    ages.set(i + 1, temp);
                    temp = order.get(i);
                    order.set(i, order.get(i + 1));
                    order.set(i + 1, temp);
                    isSorted = true;
                }

            }
        }

        for (int i : order) {
            System.out.println(list.get(i));
        }


    }

    private static void sortIndexesByIntList(ArrayList<Integer> arrayToSort, LinkedList<Integer> ind) {
        ArrayList<Integer> arr = new ArrayList<>(arrayToSort);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int tmp = ind.get(j);
                    ind.set(j, ind.get(j + 1));
                    ind.set(j + 1, tmp);

                    tmp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, tmp);
                }
            }
        }
    }

}
