package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public String goWork() {
        return "Bulldozer started its work!";
    }

    @Override
    public String stopWork() {
        return "Bulldozer stopped its work!";
    }
}
