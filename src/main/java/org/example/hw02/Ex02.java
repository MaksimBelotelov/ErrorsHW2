package org.example.hw02;

/* Если необходимо, исправьте данный код
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

*/

// Ответ: Исключение деления на ноль обрабатывается верно. Для усовершенствования добавлен блок catch, контролирующий
// выход за пределы массива.

public class Ex02 {
    public static void main(String[] args) {
        int[] intArray = {0,1,2,3,4,5,6,7,8};

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Catching out of bounds exception: " + ex);
        }
    }
}
