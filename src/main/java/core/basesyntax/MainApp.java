package core.basesyntax;

public class MainApp {
        Machine[] machines = {
                new Truck(),
                new Buldozer(),
                new Excavator()
        };

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
