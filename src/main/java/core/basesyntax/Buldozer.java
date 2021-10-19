package main.java.core.basesyntax;

public class Buldozer implements Machine {
    @Override
    public void doWork() {
        System.out.println("The buldozer is starting");
    }

    @Override
    public void stopWork() {
        System.out.println("The buldozer is finishing work");
    }
}
