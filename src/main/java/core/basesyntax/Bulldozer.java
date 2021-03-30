package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Me BULLDOZER, me do work!");
    }

    @Override
    public void stopWork() {
        System.out.println("BULLDOZER stop work, BULLDOZER go sleep!");
    }
}
