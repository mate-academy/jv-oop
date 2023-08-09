package core.basesyntax;

public class Bulldozer extends Machine {
    public String doWork() {
        return "Bulldozer" + super.doWork();
    }

    public String stopWork() {
        return "Bulldozer" + super.stopWork();
    }
}
