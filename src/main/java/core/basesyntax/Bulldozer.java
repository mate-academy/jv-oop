package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public boolean doWork() {
        System.out.println("Bulldozer started his work");
        return false;
    }

    @Override
    public boolean stopWork() {
        System.out.println("Bulldozer stoped his work");
        return false;
    }

}
