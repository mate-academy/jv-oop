package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machineArr = { new Truck(), new Bulldozer(), new Excavator() };

        for (Machine machine : machineArr) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
