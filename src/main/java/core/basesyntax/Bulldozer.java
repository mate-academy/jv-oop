package core.basesyntax;

public abstract class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("The buldozer is working");
    }
    @Override
    public void stopWork() {
        System.out.println("The buldozer is not working");
    }
}