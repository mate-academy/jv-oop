package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public String doWork() {
        return "Bulldozer" + super.doWork();
    }

    @Override
    public String stopWork() {
        return "Bulldozer" + super.stopWork();
    }
}
