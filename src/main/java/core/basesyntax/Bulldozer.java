package core.basesyntax;

/**
 * @author dogmax296
 * @link https://github.com/dogmax296
 */
public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Bulldozer is started its work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped its work!");
    }

}
