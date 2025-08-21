package core.basesyntax;

public abstract class Machine {
    public abstract void doWork();

    public abstract void stopWork();

    Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
}
