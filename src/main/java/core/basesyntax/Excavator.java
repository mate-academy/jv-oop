package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public String doWork() {
        return "Excavator started its work";
    }

    @Override
    public String stopWork() {
        return "Excavator stopped its work";
    }
}
