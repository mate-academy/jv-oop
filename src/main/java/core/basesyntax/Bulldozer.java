package core.basesyntax;

public class Bulldozer extends Machine {
    private int bulldozerNumber;

    public Bulldozer(int bulldozerNumber) {
        this.bulldozerNumber = bulldozerNumber;
    }

    public int getBulldozerNumber() {
        return bulldozerNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer #" + getBulldozerNumber() + " start work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer #" + getBulldozerNumber() + " finish work!");
    }
}
