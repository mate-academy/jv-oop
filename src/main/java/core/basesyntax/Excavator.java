package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("I'm excavator and I started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator finished working");
    }
}

