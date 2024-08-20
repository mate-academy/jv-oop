package core.basesyntax;

public class MainApp {
    private Machine machine1 = new Excavator();
    private Machine machine2 = new Bulldozer();
    private Machine machine3 = new Truck();
    private Machine[] machines = new Machine[]{machine1, machine2, machine3};

    public void getMachineCond() {

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
