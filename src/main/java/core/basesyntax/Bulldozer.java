package core.basesyntax;

/**
 * Created by SpecVova on 29.06.2023.
 */
public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println("Bulldozer starts doing it`s work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stops doing it`s work");
    }
}
