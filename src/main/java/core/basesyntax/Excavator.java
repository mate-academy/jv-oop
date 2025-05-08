package core.basesyntax;

public class Excavator extends Machine {

    private String excavatorName;

    public Excavator(String excavatorName) {
        this.excavatorName = excavatorName;
    }

    @Override
    public void doWork() {
        System.out.println(excavatorName + " started working");
    }

    @Override
    public void stopWork() {
        System.out.println(excavatorName + " has stopped working");
    }
}
