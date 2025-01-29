package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println(" Excavator Is ready to work");
    }

    @Override
    public void stopWork() {
        System.out.println(" Excavatoris finish work");
    }

}
