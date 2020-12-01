package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        this.setActive(true);
        System.out.println("Delivering it wherever you say man!");
    }

    @Override
    public void stopWork() {
        this.setActive(false);
        System.out.println("The truck is having some break! Chill!");
    }
}
