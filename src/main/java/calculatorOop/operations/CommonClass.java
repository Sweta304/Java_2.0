package calculatorOop.operations;


public abstract class CommonClass {

    private double numberOne;
    private double numberTwo;

    public CommonClass (double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public double getNumberOne() {
        return numberOne;
    }
    public double getNumberTwo() {
        return numberTwo;
    }

    public abstract double result();
}
