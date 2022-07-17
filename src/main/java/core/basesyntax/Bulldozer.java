package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public String doWork() {
        return "Bulldozer started his work";
    }

    @Override
    public String stopWork() {
        return "Bulldozer stopped his work";
    }
}
