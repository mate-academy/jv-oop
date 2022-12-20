package core.basesyntax;
public class MainApp {
    public static void main(String[] args) {
        Machine Truck = new Truck();
        Machine Bulldozer = new Bulldozer();
        Machine Excavator = new Excavator();
        Machine[] machines = new Machine[]{Truck, Bulldozer, Excavator};

        for (Machine value : machines) {
            value.doWork();
            value.stopWork();
        }
    }
}
