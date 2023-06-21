package core.basesyntax;

public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println("Bulldoser started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldoser stopped its work");
    }
}
