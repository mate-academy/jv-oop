package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] obj = new Machine[3];
        obj[0] = new Bulldozer();
        obj[1] = new Truck();
        obj[2] = new Excavator();
        for (Machine machine : obj) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
