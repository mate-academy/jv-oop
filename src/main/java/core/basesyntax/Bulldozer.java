package core.basesyntax;

public class Bulldozer extends Machine {
    private int buldozer;

    public Bulldozer(int buldozer) {
        this.buldozer = buldozer;
    }

    public int getBulldozer() {
        return buldozer;
    }

    public void setBulldozer() {
        this.buldozer = buldozer;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer #" + getBulldozer() + " start work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer #" + getBulldozer() + " stop work.");
    }
}
