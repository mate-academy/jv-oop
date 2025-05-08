package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Mashine[] machines = {new Excavator(), new Bulldozer(), new Truck()};
        for (Mashine mashine : machines) {
            mashine.doWork();
            mashine.stopWork();
        }
    }
}
