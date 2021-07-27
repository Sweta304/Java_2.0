/**Создаем калькулятор с возможностью вычисления суммы, разности, умножения и деления
 * Добавляем программу по поиску самого длинного слова, введенного с консоли
 * @author VorobevaSV
 * пользователь запускает программу на выбор:
 * "Калькулятор", либо программа "Поиск самого длинного слова"
 */

import java.util.Scanner;

public class Calculator {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("выберите опцию:\n1 - калькулятор; 2 - самое длинное слово");
        int choose = scanner.nextInt();
            //Калькулятор - начало программы
        if (choose==1) {
            System.out.print("число 1: ");
            double first = scanner.nextDouble();
            System.out.print("число 2: ");
            double second = scanner.nextDouble();
            System.out.print("операция: ");
            char operator = scanner.next().charAt(0);
            scanner.close();
            double result = 0.0;
            switch (operator) {
                case ('+'):
                    result = first + second;
                    break;
                case ('-'):
                    result = first - second;
                    break;
                case ('*'):
                    result = first * second;
                    break;
                case ('/'):
                    result = first / second;
                    break;
            }
            System.out.print("итого: ");
            System.out.printf("%.4f", result);
            //Калькулятор - конец программы

            //Поиск самого длинного слова - начало программы
        } else if (choose==2) {
            System.out.print("введите кол-во слов: ");
            int wordsQty = scanner.nextInt();
            scanner.nextLine();
            //создаем массив из слов, введенных в консоли
            String[] arrWords = new String[wordsQty];
            //заполняем массив словами
            String word;
            for (int i = 0; i < wordsQty; i++) {
                System.out.println("слово " + (i + 1) + ": ");
                word = scanner.nextLine();
                arrWords[i] = word;
            }


            //создаем и заполняем массив длинами слов
            int[] k = new int[wordsQty];
            for (int j = 0; j < wordsQty; j++) {
                char[] letterQty = arrWords[j].toCharArray();
                k[j] = letterQty.length;
            }
            //ищем и выводим в консоль самое длинное слово
            String longest = null;
            boolean flag = true;
            for (int n = 1; n < k.length; n++) {
                flag = k[n] > k[n - 1];
                if (flag) {
                    longest = arrWords[n];
                } else {
                    longest = arrWords[n - 1];
                }
            }
                System.out.println("самое длинное слово:\n" + longest);


            //Поиск самого длинного слова - конец программы

        } else {
            System.out.println("такой опции не существует");
        }
    }
}
