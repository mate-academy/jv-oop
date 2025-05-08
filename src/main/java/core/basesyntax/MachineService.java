package core.basesyntax;

public class MachineService {
    private Machine truck = new Truck();
    private Machine bulldozer = new Bulldozer();
    private Machine excavator = new Excavator();
    private Machine[] machines = {truck, bulldozer, excavator};

    private void startMachines() {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    private void stopMachines() {
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }

    public void doAllOperations() {
        startMachines();
        stopMachines();
    }

    public Machine getTruck() {
        return truck;
    }

    public void setTruck(Machine truck) {
        this.truck = truck;
    }

    public Machine getBulldozer() {
        return bulldozer;
    }

    public void setBulldozer(Machine bulldozer) {
        this.bulldozer = bulldozer;
    }

    public Machine getExcavator() {
        return excavator;
    }

    public void setExcavator(Machine excavator) {
        this.excavator = excavator;
    }

    public Machine[] getMachines() {
        return machines;
    }

    public void setMachines(Machine[] machines) {
        this.machines = machines;
    }

}
