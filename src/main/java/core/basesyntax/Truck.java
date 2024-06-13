package core.basesyntax;

public class Truck extends Machine {

    public Truck(String nameMachine) {
        super(nameMachine);
    }

    @Override
    public void doWork() {
        System.out.println(getNameMachine() + " started working");
    }

    @Override
    public void stopWork() {
        System.out.println(getNameMachine() + " stoped working");
    }
}
