package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("bulldozer start working");
    }

    @Override
    public void stopWork() {
        System.out.println("bulldozer stoped work");
    }
}
