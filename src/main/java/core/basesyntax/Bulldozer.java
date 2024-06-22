package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(getMachineType() + " is moving earth.");
    }

    @Override
    public void stopWork() {
        System.out.println(getMachineType() + " has finished moving earth and is now off.");
    }

    @Override
    public String getMachineType() {
        return "Bulldozer";
    }
}
