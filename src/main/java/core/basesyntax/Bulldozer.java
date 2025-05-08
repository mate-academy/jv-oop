package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(getName() + " The Bulldozer began its work");
    }

    @Override
    public void stopWork() {
        System.out.println(getName() + " The Bulldozer has finished its work");
    }
}
