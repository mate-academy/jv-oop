package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machinery = {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine machine : machinery) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
