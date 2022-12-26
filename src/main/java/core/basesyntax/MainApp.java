package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Bulldozer(), new Excavator(), new Truck()};
        for (int i = 0; i < 3; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
