package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Be careful, the excavator started digging a hole!!!");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator  stopped working, you can install the formwork.");

    }

}