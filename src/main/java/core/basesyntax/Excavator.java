package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("The excavator began digging a hole");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator did the job");
    }
}
