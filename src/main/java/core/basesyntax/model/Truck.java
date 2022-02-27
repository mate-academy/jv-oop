package core.basesyntax.model;

/**
 * @version 1.0
 * @autor shd
 * @created by 27/02/2022 - 17:02
 * @project oop-example
 */
public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Beginning of work Truck!");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop work Truck!");
    }
}
