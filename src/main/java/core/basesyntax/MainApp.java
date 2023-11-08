package core.basesyntax;

public class MainApp {
    
    public static void main(String[] args) {
        Machine track = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] machines = {track, bulldozer, excavator};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}





