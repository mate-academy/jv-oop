package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Excavator(), new Bulldozer(), new Truck()};

        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
