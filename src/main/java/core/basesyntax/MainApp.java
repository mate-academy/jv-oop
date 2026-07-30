package core.basesyntax;

public class MainApp {

    private final Machine[] machines = new Machine[]{new Truck(),
            new Bulldozer(), new Excavator()};

    public void startProcess() {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
