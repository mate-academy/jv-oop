package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Bulldozer started its work");
    }

    @Override
    public String stopWork() {
        return "Bulldozer stopped its work";
    }
}
