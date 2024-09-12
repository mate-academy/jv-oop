package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(new StringBuilder()
                .append(getName())
                .append(" Bulldozer started its work")
                .toString());
    }

    @Override
    public void stopWork() {
        System.out.println(new StringBuilder()
                .append(getName())
                .append(" Bulldozer stopped working")
                .toString());
    }
}
