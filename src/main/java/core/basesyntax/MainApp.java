package core.basesyntax;

public class MainApp {
    private Machine machineExcavator = new Excavator();
    private Machine machineBulldozer = new Bulldozer();
    private Machine machineTruck = new Truck();
    private Machine[] machines = new Machine[]{machineExcavator, machineBulldozer, machineTruck};

    public void getMachineCond() {

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
