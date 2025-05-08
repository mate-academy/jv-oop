package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truc = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] array = new Machine[] {truc, bulldozer, excavator};
        for (Machine machine: array) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
