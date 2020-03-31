package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Excavator начал свою работу");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator прекратил свою работу");
    }
}
