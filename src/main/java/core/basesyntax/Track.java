package core.basesyntax;

public class Track extends Machine {

    @Override
    public void doWork() {
        System.out.println("Track has started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Track has finished work");

    }
}

