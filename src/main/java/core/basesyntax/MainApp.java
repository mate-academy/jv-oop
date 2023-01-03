package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] array = new Machine[]{new Excavator(), new Bulldozer(), new Truck()};
        for (Machine i : array) {
            i.doWork();
            i.stopWork();
        }
    }
}
