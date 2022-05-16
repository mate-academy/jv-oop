package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machinesArray = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine m : machinesArray) {
            m.doWork();
            m.stopWork();
        }
    }
}
