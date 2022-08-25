package core.basesyntax;

/**
 * @author dogmax296
 * @link https://github.com/dogmax296
 */
public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck is started its work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped its work!");
    }
}
