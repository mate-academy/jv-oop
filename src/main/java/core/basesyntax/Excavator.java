package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {

        System.out.println("\nExcavator is starting it's work now!\n");

    }

    @Override
    public void stopWork() {

        System.out.println("\nExcavator is not available now!\n");

    }

}
