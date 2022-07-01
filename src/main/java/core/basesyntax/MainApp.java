package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] technique = new Machine[] {truck, bulldozer, excavator};
        for (Machine machine: technique) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
