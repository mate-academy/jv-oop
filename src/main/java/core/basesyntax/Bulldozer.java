package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public String doWork() {
        return "Bulldozer has started  work";
    }

    @Override
    public String stopWork() {
        return "Bulldozer has stopped  work";
    }
}
