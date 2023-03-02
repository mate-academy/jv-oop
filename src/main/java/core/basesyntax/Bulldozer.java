package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Bulldozer do work");
    }
    
    @Override
    public void stopWork() {
        System.out.println("The Bulldozer stop work");
    }
}
