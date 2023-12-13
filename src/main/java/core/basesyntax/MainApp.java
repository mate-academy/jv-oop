package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machineArray = {new Truck(), new Bulldozer(), new Excavator()};
        for (int i = 0; i < 3; i++) {
            machineArray[i].doWork();
            machineArray[i].stopWork();
        }
    }
}
