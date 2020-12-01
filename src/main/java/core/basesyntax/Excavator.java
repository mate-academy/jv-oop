package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        this.setActive(true);
        System.out.println("Let's dig some holes!");
    }

    @Override
    public void stopWork() {
        this.setActive(false);
        System.out.println("Give me a bit of time to relax!");
    }
}
