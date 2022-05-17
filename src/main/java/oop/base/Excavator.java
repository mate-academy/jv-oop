package oop.base;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("This Excavator started work!");
    }

    @Override
    public void stopWork() {
        System.out.println("This Excavator stopped work!");
    }

}
