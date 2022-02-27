package core.basesyntax.model;

/**
 * @version 1.0
 * @autor shd
 * @created by 27/02/2022 - 17:03
 * @project oop-example
 */
public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Beginning of work Excavator!");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop work Excavator!");
    }
}
