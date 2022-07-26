package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer() {
        name = "Bulldozer";
    }

    @Override
    public void doWork() {
        System.out.println(name + " is ready to move mountains");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " is tired");
    }
}
