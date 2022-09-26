package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();

        Machine[] machines = new Machine[]{excavator, bulldozer, truck};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
