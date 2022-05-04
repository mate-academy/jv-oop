package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("The Excavator began digging a hole");
    }

    @Override
    public void stopWork() {
        System.out.println("The Excavator did the job");
    }
}
