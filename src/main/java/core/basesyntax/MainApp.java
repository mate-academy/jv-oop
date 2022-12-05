package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine[] machines = new Machine[]{truck, excavator, bulldozer};
        for (int i = 0; i < 3; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
