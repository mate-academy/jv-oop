package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();

        Machine[] machines = {excavator, bulldozer, truck};

        for (Machine vehicle : machines) {
            vehicle.doWork();
            vehicle.stopWork();
        }
    }
}
