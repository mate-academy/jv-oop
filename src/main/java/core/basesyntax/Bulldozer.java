package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public String doWork() {
        return "I am a Bulldozer";
    }

    @Override
    public String stopWork() {
        return "Bulldozer tired";
    }
}
