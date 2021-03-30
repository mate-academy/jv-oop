package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Bulldozer started its operations");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer terminated its operations");
    }

}
