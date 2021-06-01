package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Learn English and go to IT!");
    }

    @Override
    public void stopWork() {
        System.out.println("Learning was ended");
    }
}
