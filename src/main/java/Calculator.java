/**Создаем калькулятор с возможностью вычисления суммы, разности, умножения и деления
 */

import java.util.Scanner;

public class Calculator {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("число 1: ");
        double first = scanner.nextDouble();
        System.out.print("число 2: ");
        double second = scanner.nextDouble();
        System.out.print("операция: ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double result = 0.0;
        switch (operator) {
            case('+'):
                result = first+second;
                break;
            case('-'):
                result = first-second;
                break;
            case('*'):
                result = first*second;
                break;
            case('/'):
                result = first/second;
                break;
        }

        System.out.print("итого: ");
        System.out.printf("%.4f",result);

    }
}
