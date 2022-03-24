package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] array = {new Truck(), new Excavator(), new Bulldozer()};
        for (Machine machine : array) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
