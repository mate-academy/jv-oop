package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truckObj = new Truck();
        Machine bulldozerObj = new Bulldozer();
        Machine excavatorObj = new Excavator();

        Machine[] machines = {truckObj, bulldozerObj, excavatorObj};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
