package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = { new Bulldozer(), new Truck(), new Excavator() };
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}

