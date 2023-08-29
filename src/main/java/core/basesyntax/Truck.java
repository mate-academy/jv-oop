package core.basesyntax;

public class Truck extends Machine{
    @Override
    public void dowork() {
        System.out.println("Truck started its work.");
    }

    @Override
    public void stopwork() {
        System.out.println("Truck stopped its work.");
    }
}
