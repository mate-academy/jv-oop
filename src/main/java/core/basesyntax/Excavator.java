package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public String goWork() {
        return "Excavator started work";
    }
    @Override
    public String stopWork() {
        return "Excavator stopped work";
    }
}
