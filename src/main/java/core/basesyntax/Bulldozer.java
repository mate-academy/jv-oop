package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started clearing the territory\n"
                + "and soil leveling.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has finished leveling.");
    }

}
