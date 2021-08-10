/**Класс основной логики программы
 */

package calculatorOop;

public class CalcOop {

        private double a;
        private double b;

        public CalcOop(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double addition () {
            return a+b;
        }
        public double substraction () {
            return a-b;
        }
        public double multiplication () {
            return a*b;
        }
        public double division () {
            return a/b;
        }
}
