package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machinesArray = new Machine[3];
        machinesArray[0] = new Excavator();
        machinesArray[1] = new Bulldozer();
        machinesArray[2] = new Truck();
        for (int i = 0; i < 3; ++i) {
            machinesArray[i].doWork();
        }
        for (int i = 0; i < 3; ++i) {
            machinesArray[i].stopWork();
        }
    }
}

