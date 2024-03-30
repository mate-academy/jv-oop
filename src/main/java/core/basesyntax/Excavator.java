package core.basesyntax;

public class Excavator extends Machine {
    private final String name;

    public Excavator(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(name + " is moving large amounts of material, like rock and soil");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " has stopped moving large amounts of material, like rock and "
                +
                "soil");
    }

}
