package org.example.hw04;

import java.util.InputMismatchException;
import java.util.Scanner;

// Задача4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Ex04 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        String s = "";

        while(true) {
            try {
                s = inputNotEmptyString();
                break;
            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Вы ввели строку: " + s);
    }

    public static String inputNotEmptyString() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String inpStr = "";
        inpStr = scanner.nextLine();
        if(inpStr.equals(""))
            throw new InputMismatchException("Нельзя вводить пустую строку.\nПопробуйте снова: ");
        return inpStr;
    }
}
