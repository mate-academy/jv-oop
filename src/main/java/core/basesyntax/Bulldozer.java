package core.basesyntax;

public class Bulldozer extends Machine {

    @Override

    public boolean doWork() {
        System.out.println("Bulldozer started working");
        return false;
    }

    public void stopWork() {
        System.out.println("Bulldozer started working");
    }
}
