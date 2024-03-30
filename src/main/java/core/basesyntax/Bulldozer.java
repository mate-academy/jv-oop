package core.basesyntax;

public class Bulldozer extends Machine {
    private final String name;

    public Bulldozer(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(name + " is using large blade in front for moving dirt and rocks "
                +
                "and making the ground level");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " has stopped using large blade in front for moving dirt and "
                +
                "rocks and making the ground level");
    }
}
