package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Excavator started its work");
    }

    @Override
    public String stopWork() {
        return "Excavator stopped its work";
    }
}
