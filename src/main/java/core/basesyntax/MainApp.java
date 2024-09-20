package core.basesyntax;

public class MainApp {
    private static Machine[] machines = {new Excavator(), new Truck(), new Bulldozer()};

    public static void main(String[] args) {
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
