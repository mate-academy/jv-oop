package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine [] arr = {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine m : arr) {
            m.doWork();
            m.stopWork();
        }
    }
}
