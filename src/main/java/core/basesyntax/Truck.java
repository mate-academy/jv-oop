package core.basesyntax;

/**
 * Created by SpecVova on 29.06.2023.
 */
public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck starts doing it`s work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stops doing it`s work");
    }
}
