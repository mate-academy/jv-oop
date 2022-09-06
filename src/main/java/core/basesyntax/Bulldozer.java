package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Machine Bulldozer started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine Bulldozer stopped its work");
    }
}


