package core.basesyntax;

public class MainApp {
    public MainApp(String[] qwe) {
        Machine [] machines = {new Truck(),new Excavator(),new Bulldozer()};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
