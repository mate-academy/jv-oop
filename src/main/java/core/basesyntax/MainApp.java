package core.basesyntax;

public class MainApp {
    private static Machine machineExcavator = new Excavator();
    private static Machine machineBulldozer = new Bulldozer();
    private static Machine machineTruck = new Truck();
    public static Machine[] machines = new Machine[]{machineExcavator, machineBulldozer, machineTruck};

    public static void main(String[] args) {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
