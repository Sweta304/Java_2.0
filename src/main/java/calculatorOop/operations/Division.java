package calculatorOop.operations;

public class Division extends CommonClass{

    public Division(double numberOne, double numberTwo) {
        super(numberOne, numberTwo);
    }

    @Override
    public double result(){
        return getNumberOne()/getNumberTwo();
    }
}
