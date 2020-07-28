package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("Track is working!");
    }

    @Override
    public void stopWork() {
        System.out.println("Track just stopped to work!");
    }

    @Override
    public void stopWork() {
        System.out.print(machineName + " just stopped to work!");
    }

    @Override
    public void getName(String name) {
        machineName = name;
    }
}
