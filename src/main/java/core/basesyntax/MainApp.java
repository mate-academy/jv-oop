package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine[] m = new Machine[3];
        m[0] = new Excavator();
        m[1] = new Bulldozer();
        m[2] = new Truck();
        for (Machine machine : m) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
