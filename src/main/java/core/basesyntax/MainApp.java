package core.basesyntax;

public class MainApp {

    private static final Machine[] machines = {new Bulldozer(), new Excavator(), new Truck()};

    public static void main(String[] args) {
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
