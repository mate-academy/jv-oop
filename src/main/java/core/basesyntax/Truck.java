package core.basesyntax;

public class Truck extends  Machine{
    @Override
    public void doWork() {
        System.out.println("A truck starts working");
    }

    @Override
    public void stopWork() {
        System.out.println("A truck stop working");
    }
}
