package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started working. Engine OK, Wheels OK, Fuel OK!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped working. Engine failure, Fuel OK!");
    }
}
