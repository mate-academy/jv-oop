package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer start to do job");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer finished job");
    }
}
