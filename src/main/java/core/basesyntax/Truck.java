package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Everyone disperse, the truck started work!!!");

    }
    @Override
    public void stopWork() {
        System.out.println("Having accepted the job, the truck finished loading !");
    }
}
