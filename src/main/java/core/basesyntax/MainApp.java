package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] arr = {new Buldozer(), new Excavator(), new Truck()};

        for (Machine machine : arr) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
