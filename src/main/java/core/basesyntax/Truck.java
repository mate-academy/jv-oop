package core.basesyntax;

public class Truck extends Machine {
    public Truck(String nameOfTheMachine) {
        super(nameOfTheMachine);
    }

    @Override
    public void doWork() {
        System.out.println(getNameOfTheMachine() + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println(getNameOfTheMachine() + " stopped its work");
    }
}
