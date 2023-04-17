package com.learn.seminar_2;

public class Seminar_2 {

    public static void main(String[] args) {
//
//        String a = "Hello";
//
//        long begin = System.currentTimeMillis();
//
//        for (int i = 0; i < 0; i++) {
//            a += "+";
//        }
//
//        long end = System.currentTimeMillis();
//        long result = end - begin;
//
//        System.out.println(result/1000);
//
//        StringBuilder builder = new StringBuilder(" World");
//
//        for (int i = 0; i < 5; i++) {
//            builder.append("!!!");
//        }
//
//        a += builder.toString();
//        builder.delete(0, builder.length()/2);
//        builder.insert(2, .43f);
//        builder.deleteCharAt(3);
//        builder.reverse();
//        builder.indexOf("Hel");
//        builder.lastIndexOf("l");
//        builder.replace(1, 5, "235");
//        builder.charAt(0);
//
//        System.out.println(a);
//
//        long end_t = System.currentTimeMillis();
//        long result_t = end_t - begin;
//
//        // Поковырять метод:
//        // builder.replace();
//
//        System.out.println(result_t/1000);

//        Основание -5, стапень 3, результат равен
//        Основание 127, стапень 2, результат равен
//        Основание 33, стапень 15, результат равен
//        Основание 4, стапень 7, результат равен
//        print_string("Основание -5, стапень 3, результат равен");
//        print_string("Основание 127, стапень 2, результат равен");
//        print_string("Основание 33, стапень 15, результат равен");
//        print_string("Основание 4, стапень 7, результат равен");

        // Из любого текста выковырять три строки любого текста
        // время за которое из этих трех строк мы заменим 1 любое слово
        // померить время между String и StringBuilder

        long begin = System.currentTimeMillis();
        print_any_string();
        long end = System.currentTimeMillis();
        long result = end - begin;
        System.out.println(result);

        begin = System.currentTimeMillis();
        print_any_stringbuilder();
        end = System.currentTimeMillis();
        result = end - begin;
        System.out.println(result);


    }

    private static void print_any_string() {
        String s = "Забавно. Когда я смотрел триллер «Сплит» в не таком уже и далеком 2017 году, то эти актрисы, сыгравшие старшеклассниц, похищенных злодеем с диссоциативным расстройством личности, казались мне обычными миловидными девчонками. А сейчас открываешь актерский состав фильма и понимаешь, что смотрел на будущих звездочек.\n" +
                "Аня Тейлор-Джой уже успела к тому времени сыграть в «Ведьме» и «Моргане», однако еще не стала тем человеком, лицо которого без труда угадывалось и идентифицировалось как физиономия звезды. А посмотрите на нее сейчас. «Обитель теней», «Ход королевы», «Новые мутанты», «Прошлой ночью в Сохо», «Меню» — это далеко не все проекты, в которых поучаствовала после «Сплита» эта яркая девушка.";
//        String[] new_s = s.split(" ");
//
//
//        for (int i = 0; i < new_s.length; i++) {
//            if (i == 2 || i == 4 || i == 6) {
//                new_s[i] = "ого";
//            }
//        }
//
//        String s_new = "";
//        for (int i = 0; i < new_s.length; i++) {
//            s_new += new_s[i] + " ";
//        }
        System.out.println(s.replace("Сплит","ого"));

    }

    private static void print_any_stringbuilder() {
        StringBuilder s = new StringBuilder("Забавно. Когда я смотрел триллер «Сплит» в не таком уже и далеком 2017 году, то эти актрисы, сыгравшие старшеклассниц, похищенных злодеем с диссоциативным расстройством личности, казались мне обычными миловидными девчонками. А сейчас открываешь актерский состав фильма и понимаешь, что смотрел на будущих звездочек.\n" +
                "Аня Тейлор-Джой уже успела к тому времени сыграть в «Ведьме» и «Моргане», однако еще не стала тем человеком, лицо которого без труда угадывалось и идентифицировалось как физиономия звезды. А посмотрите на нее сейчас. «Обитель теней», «Ход королевы», «Новые мутанты», «Прошлой ночью в Сохо», «Меню» — это далеко не все проекты, в которых поучаствовала после «Сплита» эта яркая девушка.");
        for (int i = 0; i < s.length(); i++) {
            int j = s.indexOf("Сплит");
            if (j < 0) break;
            s.replace(j, j + 5, "ого");
        }
        System.out.println(s);


    }

    private static void print_string(String s) {

        String[] m1 = s.split(", ");
        String[] m1_1 = m1[0].split(" ");
        String[] m1_2 = m1[1].split(" ");

        String a = m1_1[1];
        Integer a_int = Integer.parseInt(a);
        String b = m1_2[1];
        Integer b_int = Integer.parseInt(b);
        Double result = Math.pow(a_int, b_int);
        System.out.println("Основание " + a + ", стапень " + b + ", результат равен " + Math.round(result));


    }

}
