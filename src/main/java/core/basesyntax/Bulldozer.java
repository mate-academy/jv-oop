package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void dowork() {
        System.out.println("Bulldozer started its work.");
    }

    @Override
    public void stopwork() {
        System.out.println("Bulldozer stopped its work.");
    }
}
