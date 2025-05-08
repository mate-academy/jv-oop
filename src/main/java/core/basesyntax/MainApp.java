package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        var machines = new Machine[]{
                new Bulldozer(),
                new Excavator(),
                new Truck()
        };

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
