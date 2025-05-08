package core.basesyntax;

public class MainApp {
    public static void main() {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] machines = {truck, bulldozer, excavator};
        for (Machine i : machines) {
            i.doWork();
            i.stopWork();
        }
    }
}
