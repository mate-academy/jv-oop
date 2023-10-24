package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] machines = {bulldozer, excavator, truck};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
