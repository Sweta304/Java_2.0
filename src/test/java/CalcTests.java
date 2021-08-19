import calculatorOop.CalcOop;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;


public class CalcTests {

    @Test
    public void addCheck () {
        double a = 3;
        double b = 4;
        double expected = 7;
        CalcOop calcOop = new CalcOop (a,b);

        Assert.assertEquals("сложение не работает",expected,calcOop.addition(),0);
    }

    @Test
    public void subsCheck () {
        double a = 3;
        double b = 4;
        double expected = -1;
        CalcOop calcOop = new CalcOop (a,b);
        Assert.assertEquals("вычитание не работает",expected,calcOop.subtraction(),0);
    }

    @Test
    public void multCheck () {
        double a = 3;
        double b = 4;
        double expected = 12;
        CalcOop calcOop = new CalcOop (a,b);
        Assert.assertEquals("умножение не работает",expected,calcOop.multiplication(),0);
    }

    @Test
    public void divCheck () {
        double a = 6;
        double b = 2;
        double expected = 3;
        CalcOop calcOop = new CalcOop (a,b);
        Assert.assertEquals("деление не работает",expected,calcOop.division(),0);
    }


    @Test (expected = ArithmeticException.class)
    public void divOnZeroCheck () {
        double a = 6;
        double b = 0;
        CalcOop calcOop = new CalcOop (a,b);
        calcOop.division();
    }

}
