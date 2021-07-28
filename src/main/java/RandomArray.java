/** Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Ищем максимальный отрицательный и минимальный положительный элементы массива. Меняем их местами.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.lang.String;

public class RandomArray {
    public static void main (String [] args) {
        Random random = new Random();

        int[] someArray = new int[20];

        //заполняем массив значениями и выводим на консоль
        for (int i = 0; i < someArray.length; i++) {
            int result = 10 - random.nextInt(20);
            someArray[i] = result;
            System.out.print(result+"; ");
        }
        System.out.println();

        //объявляем переменные для записи минимального и максимального значения
        int max = 0;
        int min = 0;

        //определяем начальное значение минимальной и максимальной переменных
        for (int j=0;j<someArray.length;j++) {
            if (someArray[j]<0) {
                max = someArray[j];
                break;
            } else {
                continue;
            }
        }

        for (int n=0;n<someArray.length;n++) {
            if (someArray[n]>=0) {
                min = someArray[n];
                break;
            } else {
                continue;
            }
        }

        //вычисляем максимальный и минимальный элемент массива и выводим на консоль
        for (int k=0;k<someArray.length;k++){
            if (someArray[k]<0) {
                max = Math.max(max, someArray[k]);
            } else {
                min = Math.min(min, someArray[k]);
            }
        }

        System.out.print("Максимальный отрицательный элемент массива: ");
        System.out.println(max);
        System.out.print("Минимальный положительный элемент массива: ");
        System.out.println(min);

        //определяем индексы минимального и максимального элементов
        int indexMax = 0;
        int indexMin = 0;

        for (int x=0;x<someArray.length;x++) {
            if (max==someArray[x]){
                indexMax = x;
            } else if (min==someArray[x]){
                indexMin = x;
            }
        }

        //меняем местами максимальный и минимальный элементы
        int tempMax = 0;
        int tempMin = 0;

        tempMax = someArray[indexMax];
        tempMin = someArray[indexMin];

        someArray[indexMax] = tempMin;
        someArray[indexMin] = tempMax;

        //выводим в консоль итоговый массив
        for (int m=0;m<someArray.length;m++) {
            System.out.print(someArray[m] + "; ");
        }
    }
}
