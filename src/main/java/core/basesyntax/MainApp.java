package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };

        for (Machine machine : machines) {
            System.out.println("\t" + machine.getMachineType());
            machine.doWork();
            machine.stopWork();
        }

    }
}
