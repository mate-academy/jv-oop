
package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] machinesIsWork = new Machine[]{truck, bulldozer, excavator};
        for (Machine machine : machinesIsWork) {
            machine.doWork();
        }
        for (Machine machine : machinesIsWork) {
            machine.stopWork();
        }
    }
}


