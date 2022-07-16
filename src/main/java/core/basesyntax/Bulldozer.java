package core.basesyntax;

public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println("The bulldozer start working");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer stop working");
    }
}
