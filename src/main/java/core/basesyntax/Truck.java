package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println(new StringBuilder()
                .append(getName())
                .append(" Truck started its work")
                .toString());
    }

    @Override
    public void stopWork() {
        System.out.println(new StringBuilder()
                .append(getName())
                .append(" Truck stopped working")
                .toString());
    }
}
