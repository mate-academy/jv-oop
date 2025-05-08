package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Buldozer(), new Excavator()};
        for (Machine unit : machines) {
            unit.doWork();
            unit.stopWork();
        }
    }
}
