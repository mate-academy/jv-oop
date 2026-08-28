package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] units = {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };

        for (Machine unit : units) {
            unit.doWork();
            unit.stopWork();
        }
    }

}
