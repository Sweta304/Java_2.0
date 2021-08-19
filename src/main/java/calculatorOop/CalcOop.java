/**Класс основной логики программы
 */

package calculatorOop;

import java.util.InputMismatchException;

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
        public double subtraction() {
            return a-b;
        }
        public double multiplication () {
            return a*b;
        }
        public double division () {
            if(b==0){
                throw new ArithmeticException();
            } else {
                return a/b;
            }

//            } catch (
//                    ArithmeticException e) {
//                System.out.println("Деление на ноль запрещено");
//            } catch (
//                    InputMismatchException e) {
//                System.out.println("Введите число!");
//            }
        }


    public double getA(double a) {
        return a;
    }

    public double getB(double b) {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
