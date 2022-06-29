package core.basesyntax;

public class Excavator extends Machine {
    public Excavator(String nameOfTheMachine) {
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
