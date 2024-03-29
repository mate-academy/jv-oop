package core.basesyntax;

import org.w3c.dom.ls.LSOutput;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started its work");
    }
    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working");
    }
}
