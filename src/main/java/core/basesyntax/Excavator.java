package core.basesyntax;

public class Excavator extends Machines {

    @Override
    public String doWork() {
        return "Excavator started it's work";
    }

    @Override
    public String stopWork() {
        return "Excavator stopped it's work";
    }
}
