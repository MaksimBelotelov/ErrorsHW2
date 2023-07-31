package org.example.hw03;

import java.io.FileNotFoundException;

/* Задача3. Дан код. Исправьте код там, где это требуется.

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}
 */

// Ответ:
// 1. Убран throw метода main();
// 2. Обработчик первого catch заменен, чтобы обработать FileNotFoundException, который может выкинуть метод printSum;
// 3. Обработчик catch с Throwable перемещен в конец, так как если он будет выше других, он перехватит все исключения
// и не даст отрабатывать другим catch.
// 4. В метод printSum добавлено условие выбрасывания исключения FileNotFound. Обрабатывается исключение в методе main();

public class Hw03 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (FileNotFoundException ex) {
            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Если ничего не подошло, обработаем здесь");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        if(a == b) throw new FileNotFoundException();
        System.out.println(a + b);
    }
}
