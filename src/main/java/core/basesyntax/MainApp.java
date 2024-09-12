package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machineList = new Machine[]{new Bulldozer(), new Truck(), new Excavator()};

        for (Machine machine : machineList) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
