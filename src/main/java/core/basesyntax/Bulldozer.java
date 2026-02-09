package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer(String bulldozerName) {
        this.name = bulldozerName;
    }

    @Override
    public void doWork() {
        System.out.println(name + " started to work.");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stopped working.");
    }
}
