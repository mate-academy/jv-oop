package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine [] machinesArray = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : machinesArray) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
