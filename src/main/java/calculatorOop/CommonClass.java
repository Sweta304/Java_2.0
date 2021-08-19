package calculatorOop;

import java.util.InputMismatchException;

public class CommonClass {
    public static void main(String[] args) {
        try {
        CalcReader calcReader = new CalcReader();
        System.out.println("Введите первое число: ");
        double numberOne = calcReader.readNums();
        System.out.println("Введите второе число: ");
        double numberTwo = calcReader.readNums();

        CalcOop calcOop = new CalcOop(numberOne, numberTwo);

        System.out.println("Выберите действие:\n1 - сложение\n2 - вычитание\n3 - умножение\n4 - деление");
        int operator = (int) calcReader.readNums();

            switch (operator) {
                case (1):
                    System.out.printf("%.4f", calcOop.addition());
                    break;
                case (2):
                    System.out.printf("%.4f", calcOop.subtraction());
                    break;
                case (3):
                    System.out.printf("%.4f", calcOop.multiplication());
                    break;
                case (4):
                    System.out.printf("%.4f", calcOop.division());
                    break;
            }
        } catch (
                    ArithmeticException e) {
                System.out.println("Деление на ноль запрещено!");
            } catch (
                    InputMismatchException e) {
                System.out.println("Введите число!");
            }
        }
    }
