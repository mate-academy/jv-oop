package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] machinesArr = new Machine[]{truck,bulldozer,excavator};

        for (Machine i : machinesArr) {
            i.doWork();
        }

        for (Machine i : machinesArr) {
            i.stopWork();
        }

    }
}
