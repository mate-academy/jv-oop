package core.basesyntax;

public class MainApp {
    private Machine[] machines = new Machine[] {new Truck(), new Bulldozer(), new Excavator()};

    public Machine[] getMachines() {
        return machines;
    }

    public void setMachines(Machine[] machines) {
        this.machines = machines;
    }

    public void startWorkingDay() {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
