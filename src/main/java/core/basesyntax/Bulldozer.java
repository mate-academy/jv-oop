package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The excavator dug a trench. Prepare the truck.");
    }

    @Override
    public void stopWork() {
        System.out.println("The soil is submerged. Break.");
    }
}
