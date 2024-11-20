package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator(1);
        Machine bulldozer = new Bulldozer(1);
        Machine truck = new Truck(1);

        Machine[] machines = {excavator, bulldozer, truck};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
