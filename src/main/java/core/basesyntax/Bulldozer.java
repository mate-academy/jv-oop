package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    void work() {
        System.out.println("Bulldozer START working");
    }

    @Override
    void stopWork() {
        System.out.println("Bulldozer STOP working");
    }
}
