package core.basesyntax;

public class Bulldozer extends Machine {
    private String name;

    public Bulldozer(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer is moving earth");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has finished moving earth");
    }
}
