package collections;

public class MainCode {
    public static void main(String[] args) {
        FileScan a = new FileScan("/Users/sveta/Тестирование ПО/Курсы/Java 2.0/explfl");
        MakingSet b = new MakingSet(a.fileScan());
        Operations c = new Operations(b.makingSet());

        c.order();
        System.out.println("----");
        c.frequency();
        System.out.println("----");
        c.counter();
    }
}