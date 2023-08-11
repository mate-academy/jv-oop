package model;

public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("Excavator is started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator is stopped to work");
    }
}
