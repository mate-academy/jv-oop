package core.basesyntax;

public class MainApp {
    private Machine truck = new Truck();
    private Machine bulldozer = new Bulldozer();
    private Machine excavator = new Excavator();

    public void workIndicate() {
        Machine[] machines = new Machine[]{truck, bulldozer, excavator};
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    public void stopIndicate() {
        Machine[] machines = new Machine[]{truck, bulldozer, excavator};
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }

}
