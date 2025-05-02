package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public boolean doWork() {
        System.out.println("Bulldozer started his work");
        return true;
    }

    @Override
    public boolean stopWork() {
        System.out.println("Bulldozer stopped his work");
        return true;
    }

}
