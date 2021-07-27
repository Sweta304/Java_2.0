import java.util.Random;

/** Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Ищем максимальный отрицательный и минимальный положительный элементы массива. Меняем их местами.
 */

public class RandomArray {
    public static void main (String [] args) {
        Random random = new Random();

        int[] someArray = new int[20];

        //вывод в консоль всех элементов массива
        for (int i = 0; i < someArray.length; i++) {
            int result = 10 - random.nextInt(20);
            someArray[i] = result;
            System.out.print(result+"; ");
        }
        System.out.println();

        //вывод в консоль максимального и минимального элементов
        int max = someArray[0];
        int min = someArray[0];
        for (int k=0;k<someArray.length;k++){
            max = Math.max(max,someArray[k]);
            min = Math.min(min,someArray[k]);
        }
        System.out.print("Максимальный элемент массива: ");
        System.out.println(max);
        System.out.print("Минимальный элемент массива: ");
        System.out.println(min);
    }
}
