/**Класс, который описывает считывание значений с консоли
 */
package calculatorOop;

import java.util.Scanner;

public class CalcReader {
    public double readNums () {
        Scanner scanner = new Scanner(System.in);
        double n = 0;
        n = scanner.nextDouble();
        return n;
    }
}
