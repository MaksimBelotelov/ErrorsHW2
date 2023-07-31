package org.example.hw01;


// Реализуйте метод, который запрашивает у пользователя ввод дробного числа
// типа float, и возвращает введенное значение. Ввод текста вместо числа не
// должен приводить к падению приложения. Вместо этого необходимо повторно
// запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = 0;

        System.out.print("Введите число: ");
        while(true) {
            try {
                num = scanner.nextFloat();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Необходимо ввести число\nПопробуйте снова:");
                scanner.next();
            }
        }
        System.out.println("Вы ввели число: " + num);
    }
}
