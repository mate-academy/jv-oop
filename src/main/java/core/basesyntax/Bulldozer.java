package core.basesyntax;

public class Bulldozer extends Machines {

    @Override
    public String doWork() {
        return "Bulldozer started it's work";
    }

    @Override
    public String stopWork() {
        return "Bulldozer stopped it's work";
    }
}
