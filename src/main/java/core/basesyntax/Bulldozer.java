package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Driving a bulldozer do Work");
    }

    @Override
    public void stopWork() {
        System.out.println("Driving a bulldozer stop Work");
    }
}
