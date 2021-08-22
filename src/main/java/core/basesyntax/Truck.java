package core.basesyntax;

public class Truck extends Machine {
    private String truck = "Truck";
    public String getTruck() {
        return truck;
    }

    @Override
    public void doWork() {
        System.out.println(getTruck() + " started its work");

    }

    @Override
    public void stopWork() {
        System.out.println(getTruck() + " stopped its work");

    }
}
