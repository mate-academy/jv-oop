package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine ford = new Truck();
        Machine cat = new Bulldozer();
        Machine iveco = new Excavator();
        Machine[] machines = new Machine[]{ford, cat, iveco};
        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
