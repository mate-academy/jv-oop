package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public String doWork() {
        return "Bulldozer started its work";
    }

    @Override
    public String stopWork() {
        return "Bulldozer stopped its work";
    }
}
