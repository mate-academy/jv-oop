package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(getNameOfMachine() + " started work!");

    }

    @Override
    public void stopWork() {
        System.out.println(getNameOfMachine() + " finished work!");
    }
}
