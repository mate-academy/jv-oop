package core.basesyntax;

public class Excavator extends Machine {
    private String excavator = "Excavator";
    public String getExcavator() {
        return excavator;
    }

    @Override
    public void doWork() {
        System.out.println(getExcavator() + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println(getExcavator() + " stopped its work");
    }
}
