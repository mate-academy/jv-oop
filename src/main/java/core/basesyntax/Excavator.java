package core.basesyntax;

public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("Oh, no. Another working day(");
    }

    @Override
    public void stopWork() {
        System.out.println("Finally it's over. Buy guys!");
    }
}
