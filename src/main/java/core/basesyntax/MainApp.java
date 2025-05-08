package core.basesyntax;

public class MainApp {
    public void doWork() {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}

