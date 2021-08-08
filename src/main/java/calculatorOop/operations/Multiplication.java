package calculatorOop.operations;

public class Multiplication extends CommonClass{

    public Multiplication(double numberOne, double numberTwo) {
        super(numberOne, numberTwo);
    }


    @Override
    public double result(){
        return getNumberOne()*getNumberTwo();
    }
}
