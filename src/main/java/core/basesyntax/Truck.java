package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {

        boolean work = true ;
        System.out.println("Truck starts working");
        }

    @Override
    public void stopWork() {
        boolean stop = true ;
        System.out.println("Truck stops working");
    }
}
