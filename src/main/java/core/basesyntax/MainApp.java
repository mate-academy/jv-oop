package core.basesyntax;

public class MainApp {
    public static void main() {
        Machine[] machines = new Machine[] {new Bulldozer(), new Truck(), new Excavator()};
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
