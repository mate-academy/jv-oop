package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer(String nameOfTheMachine) {
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
