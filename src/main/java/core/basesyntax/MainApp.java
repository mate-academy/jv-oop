package core.basesyntax;

public class MainApp {
    public static void main() {
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine excavator = new Excavator();

        Machine[] machines = {truck, bulldozer, excavator};
        for(Machine machine : machines){
            machine.doWork();
            machine.stopWork();
        }
    }
}
