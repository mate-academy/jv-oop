package core.basesyntax;

public class Bulldozer extends Machine {
    private int number;

    public Bulldozer(int number) {
        this.number = number;
    }

    public int getBulldozer() {
        return number;
    }

    public void setBulldozer() {
        this.number = number;
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
