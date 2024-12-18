package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] technic = new Machine[3];
        technic[0] = new Truck();
        technic[1] = new Bulldozer();
        technic[2] = new Excavator();
        for (Machine machine : technic) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
