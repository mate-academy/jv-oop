package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] MachineArray = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : MachineArray) {
            machine.doWork();
            machine.stopWork();

        }
    }


}
