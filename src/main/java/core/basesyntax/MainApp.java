package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machineArray = {new Bulldozer(), new Truck(), new Excavator()};
        for (Machine machines : machineArray) {
            machines.doWork();
            machines.stopWork();
        }
    }
}
