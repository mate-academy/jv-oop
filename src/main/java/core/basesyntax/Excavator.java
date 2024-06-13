package core.basesyntax;

public class Excavator extends Machine {

    public Excavator(String nameMachine) {
        super(nameMachine);
    }

    @Override
    public void doWork() {
        System.out.println(getNameMachine() + " start work");
    }

    @Override
    public void stopWork() {
        System.out.println(getNameMachine() + " stoped work");
    }
}
