package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] arr = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine machine : arr) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
