package core.basesyntax;

public class Buldozer extends Machine {

    @Override
    void doWork() {
        System.out.println("Buldozer starts working");
    }

    void stopWork() {
        System.out.println("Buldozer stops working");
    }
}
