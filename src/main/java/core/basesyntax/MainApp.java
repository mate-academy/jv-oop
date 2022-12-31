package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Mashine[] arr = {new Excavator(), new Bulldozer(), new Truck()};
        for (Mashine mashine : arr) {
            mashine.doWork();
            mashine.stopWork();
        }
    }
}
