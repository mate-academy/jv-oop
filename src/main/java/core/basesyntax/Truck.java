
package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("truck start working");
    }

    @Override
    public void stopWork() {
        System.out.println("truck stoped work");
    }
}
