package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] transport = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : transport) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
