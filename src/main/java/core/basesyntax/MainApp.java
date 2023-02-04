package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine i: machines) {
            i.doWork();
            i.stopWork();
        }
    }
}
