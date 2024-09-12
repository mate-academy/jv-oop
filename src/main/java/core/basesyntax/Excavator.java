package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(new StringBuilder()
                .append(getName())
                .append(" Excavator started its work")
                .toString());
    }

    @Override
    public void stopWork() {
        System.out.println(new StringBuilder()
                .append(getName())
                .append(" Excavator stopped working")
                .toString());
    }
}
