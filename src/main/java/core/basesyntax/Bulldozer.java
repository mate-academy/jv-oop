package core.basesyntax;

import javax.crypto.Mac;

public class Bulldozer extends Machine {
    public Bulldozer(String bulldozerName) {
        this.name = bulldozerName;
    }
    @Override
    public void doWork() {
        System.out.println("Machine " + name + " is working");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine " + name + " is not working");
    }
}
