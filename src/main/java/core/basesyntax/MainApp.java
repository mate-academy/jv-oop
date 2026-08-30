package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] machines = {truck, bulldozer, excavator};

        for (int a = 0; a < machines.length; a++) {
            machines[a].doWork();
            machines[a].stopWork();
        }
    }
}
