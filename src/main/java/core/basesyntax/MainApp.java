package core.basesyntax;

public class MainApp {
    private final static Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};

    public static void main(String[] args) {
        for (Machine m : machines) {
            m.doWork();
        }
        for (Machine m : machines) {
            m.stopWork();
        }
    }
}
