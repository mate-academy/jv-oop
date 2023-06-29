package core.basesyntax;

/**
 * Created by SpecVova on 29.06.2023.
 */
public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("Excavator starts doing it`s work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stops doing it`s work");
    }
}
