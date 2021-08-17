package core.basesyntax;

import org.w3c.dom.ls.LSOutput;

public abstract class Machine {
    public void doWork() {
        System.out.println("started working");;
    }

    public abstract void stopWork();
}
