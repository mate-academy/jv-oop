package core.basesyntax;

public class Bulldozer extends Machine {

    @java.lang.Override
    public void doWork() {
        System.out.println("Bulldozer was started to work");
    }

    @java.lang.Override
    public void stopWork() {
        System.out.println("Bulldozer was stopped to work");
    }
}
