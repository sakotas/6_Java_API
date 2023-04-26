package com.example.homework_1;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Homework_4 {

    public static void main(String[] args) throws IOException {

        String PATH = "src/main/java/com/example/homework_1/data.txt";

        //1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
        FileWriter fw = new FileWriter(PATH, true);
        fw.write("Смирнов Смирен Иванович 60 М\n");
        fw.close();

        FileReader fr = new FileReader(PATH);

        //2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы.
        // Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
        //3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки.
        // Фамилии, имена, отчества, возрас и пол в отдельных списках.

        Scanner scanner = new Scanner(fr);

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<String> family_names = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> second_names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> genders = new ArrayList<>();

        while (scanner.hasNext()){
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

        for (int i = 0; i < ids.size(); i++) {
            System.out.println(family_names.get(i) + " "
            + names.get(i).charAt(0) + "." + " "
            + second_names.get(i).charAt(0) + "." + " "
            + ages.get(i) + " "
            + genders.get(i));
        }

        //4.Отсортировать по возрасту используя дополнительный список индексов.
        ArrayList<Integer> order = new ArrayList<>(ids);
        int temp;
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

        fr.close();

    }

}
