package calculatorOop.operations;

    public class Substraction extends CommonClass{

        public Substraction(double numberOne, double numberTwo) {
            super(numberOne, numberTwo);
        }

        @Override
        public double result(){
            return getNumberOne()-getNumberTwo();
        }
    }

