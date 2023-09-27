package core.basesyntax;

public abstract class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine[] machines = new Machine[]{excavator, bulldozer, truck};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
