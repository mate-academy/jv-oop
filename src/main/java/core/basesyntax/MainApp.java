package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine track = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine [] machines = new Machine [] {track,bulldozer,excavator};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
