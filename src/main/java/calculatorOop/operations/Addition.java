package calculatorOop.operations;

public class Addition extends CommonClass {

    public Addition(double numberOne, double numberTwo) {
        super(numberOne, numberTwo);
    }

    @Override
    public double result(){
        return getNumberOne()+getNumberTwo();
    }

}
