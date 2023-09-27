package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck1 = new Truck();
        Machine bulldozer1 = new Bulldozer();
        Machine excavator1 = new Excavator();

        Machine[] machines = new Machine[] {truck1, bulldozer1, excavator1};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
