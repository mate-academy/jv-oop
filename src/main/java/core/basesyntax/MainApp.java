package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer2000 = new Bulldozer();
        Machine pickup = new Truck();
        Machine backhoeExcavator = new Excavator();

        Machine[] machines = new Machine[] {pickup, backhoeExcavator, bulldozer2000};
        for (Machine machine : machines) {
            machine.doWork();
        }
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
