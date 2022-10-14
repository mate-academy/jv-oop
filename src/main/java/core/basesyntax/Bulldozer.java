package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public String doWork() {
        return "Bulldozer is working";
    }
    @Override
    public String stopWork() {
        return "Bulldozer stopped working";
    }
}
