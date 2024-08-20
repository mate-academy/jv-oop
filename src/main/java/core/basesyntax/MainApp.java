package core.basesyntax;

public class MainApp {

    private Machine excavator = new Excavator();
    private Machine bulldozer = new Bulldozer();
    private Machine truck = new Truck();
    private Machine[] machines = new Machine[]{excavator, bulldozer, truck};

    public void getMachineCond() {

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
