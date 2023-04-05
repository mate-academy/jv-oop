package core.basesyntax;

import java.net.StandardSocketOptions;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer start work");
    }
    @Override
    public void stopWork() {
        System.out.println("Bulldozer stop work");
    }
}
