package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public String doWork() {
        return "I am a excavator";
    }

    @Override
    public String stopWork() {
        return "excavator tired";
    }
}
