package core.basesyntax;

public class MainApp {
    public static void Main() {
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine[] machines = {bulldozer, truck, excavator};
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
