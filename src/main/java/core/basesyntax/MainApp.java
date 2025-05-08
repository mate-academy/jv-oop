package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] trucks = {truck, bulldozer, excavator};
        for (Machine currentMachine : trucks) {
            currentMachine.doWork();
            currentMachine.stopWork();
        }
    }
}
