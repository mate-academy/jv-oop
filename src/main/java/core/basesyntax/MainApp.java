package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine [] machineGroup = {new Truck(), new Buldozzer(), new Excavator()};

        for (Machine machine : machineGroup) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
