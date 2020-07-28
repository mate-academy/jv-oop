package core.basesyntax;

public class Bulldozer extends Machine {
    private String machineName = "Bulldozer";

    @Override
    public void doWork() {
        System.out.print(machineName + " is working!");
    }

    @Override
    public void stopWork() {
        System.out.print(machineName + " just stopped to work!");
    }

    @Override
    public void setName(String name) {
        machineName = name;
    }
}
