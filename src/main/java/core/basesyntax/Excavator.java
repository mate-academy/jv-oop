package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavarot work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavarot stop work");
    }
}
