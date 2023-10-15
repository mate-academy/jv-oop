package core.basesyntax;

public class MainApp {
    public static void main (String[] args) {
        Machine[] machines = {
                new Machines.Truck(),
                new Machines.Bulldozer(),
                new Machines.Excavator()
        };

        for(Machine machine : machines) {
            machine.doWork();
        }

        for(Machine machine : machines) {
            machine.stopWork();
        }
    }

}
