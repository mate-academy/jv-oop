package core.basesyntax;

public class Bulldozer extends Machine {
    private String bulldozerName = "Bulldozer";

    @Override
    public void doWork() {
        System.out.println(bulldozerName + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println(bulldozerName + " finished its work");
    }
}
