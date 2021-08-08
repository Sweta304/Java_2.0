package calculatorOop;

import calculatorOop.operations.Addition;
import calculatorOop.operations.Division;
import calculatorOop.operations.Multiplication;
import calculatorOop.operations.Substraction;

import java.util.Scanner;

public class CalculatorOop {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Первое число: ");
        double a = scanner.nextDouble();
        System.out.print("Второе число: ");
        double b = scanner.nextDouble();
        System.out.print("Введите операнд: ");
        char operand = scanner.next().charAt(0);
        System.out.print("Итого: ");

        switch (operand) {
            case ('+'):
                Addition addition = new Addition(a,b);
                System.out.printf("%.4f",addition.result());
                break;
            case ('-'):
                Substraction substraction = new Substraction(a,b);
                System.out.printf("%.4f",substraction.result());
                break;
            case ('*'):
                Multiplication multiplication = new Multiplication(a,b);
                System.out.printf("%.4f",multiplication.result());
                break;
            case ('/'):
                Division division = new Division(a,b);
                System.out.printf("%.4f",division.result());
                break;
        }


    }
}