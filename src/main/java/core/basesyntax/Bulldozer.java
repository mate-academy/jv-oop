package core.basesyntax;

public class Bulldozer extends Machine {
    private String name = "Bulldozer";

    @Override
    public void doWork() {
        System.out.println(name + " started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stopped its work");
    }
}
