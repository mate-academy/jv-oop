package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] machinesArr = new Machine[]{truck,bulldozer,excavator};

        for (Machine machineStart : machinesArr) {
            machineStart.doWork();
        }

        for (Machine machineStop : machinesArr) {
            machineStop.stopWork();
        }

    }
}
