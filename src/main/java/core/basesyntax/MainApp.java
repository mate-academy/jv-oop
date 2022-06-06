package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine [] cor = new Machine[] {bulldozer,truck,excavator};
        for (Machine machine: cor) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
