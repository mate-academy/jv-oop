package core.basesyntax;

public class Truck extends Machine {

    public Truck (String machine){
        super(machine);
    }
    @Override
    public void doWork() {
        System.out.println(machine + " started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println(machine + " stopped working. ");

    }
}
