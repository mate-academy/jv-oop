package core.basesyntax;

public class MainApp {
    private void machineWork() {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();

        Machine[] machines = new Machine[]{excavator, bulldozer, truck};

        for (Machine machine : machines) {
            System.out.println(excavator.doWork());
            System.out.println(machine.stopWork());
        }
    }

}
