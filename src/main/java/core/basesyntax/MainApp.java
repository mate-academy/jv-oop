package core.basesyntax;

public class MainApp {
    public static void MainApp( String [] arg) {
        Machine[] machin = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : machin) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
