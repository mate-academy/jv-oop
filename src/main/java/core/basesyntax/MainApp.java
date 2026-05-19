package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine [] machine = {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine value : machine) {
            value.doWork();
            value.stopWork();
        }
    }
}
