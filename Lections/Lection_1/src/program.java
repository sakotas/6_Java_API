import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        /*
         * Типы данных
         * */
        float f = 25.222f;
        double d = 123.15;
        System.out.println(f);
        System.out.println(d);

        boolean b = true ^ false;
        System.out.println(b);

//        var i = 123;

        String str = "hello world";
        System.out.println(str);
//        System.out.println(i-- >= --i);

        /*
         * Массивы
         * */

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
            System.out.println(arr[i]);
        }

        System.out.println(arr); // 10

        arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr.length); // 5

        int[] arr_multi[] = new int[3][5];
        for (int[] line : arr_multi) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

        /*
         * Ввод данных из терминала
         * */


        /*Получение строки*/
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();

        /*Получение примитивных видов данных*/
        Scanner iScanner_1 = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner_1.nextInt();
        System.out.printf("double a: ");
        double y = iScanner_1.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner_1.close();


    }
}