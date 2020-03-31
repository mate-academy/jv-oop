package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(this.name + " have just started working");
    }

    @Override
    public void stopWork() {
        System.out.println(this.name + " have just stopped working");
    }
}
