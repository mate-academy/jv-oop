package core.basesyntax;

public class Bulldozer extends Machine {

    public Bulldozer(String nameMachine) {
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
