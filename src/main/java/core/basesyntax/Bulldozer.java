package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public String stopWork() {
        return "The bulldozer has finished working";
    }

    @Override
    public String doWork() {
        return "The bulldozer starts working";
    }
}
