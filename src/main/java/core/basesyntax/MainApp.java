package core.basesyntax;

public class MainApp {
    private final Machine truck = new Truck();
    private final Machine bulldozer = new Bulldozer();
    private final Machine excavator = new Excavator();
    private final Machine[] machines = {truck, bulldozer, excavator};

    public void printInfo() {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
