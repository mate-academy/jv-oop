package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Me EXCAVATOR, me do work!");
    }

    @Override
    public void stopWork() {
        System.out.println("EXCAVATOR stop work, EXCAVATOR go sleep!");
    }
}
