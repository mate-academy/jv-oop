package core.basesyntax;

/**
 * @author dogmax296
 * @link https://github.com/dogmax296
 */
public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Excavator is started its work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped its work!");
    }

}
