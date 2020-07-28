package core.basesyntax;

public class Excavator extends Machine {

    @Override
    void doWork() {
        System.out.println("Excavator starts working");
    }

    void stopWork() {
        System.out.println("Excavator stops working");
    }
}
