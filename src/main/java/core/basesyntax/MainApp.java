package core.basesyntax;

public class MainApp {
    private final Machine truck = new Truck();

    private final Machine excavator = new Excavator();

    private final Machine bulldozer = new Bulldozer();

    private final Machine[] machines = {truck, excavator, bulldozer};

    public void isWork(String args) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    public void isStoppedWorking(String args) {
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
