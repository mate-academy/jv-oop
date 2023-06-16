package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
       Machine [] mass = {new Bulldozer(), new Excavator(), new Truck()};
        for (int i = 0; i < mass.length; i++) {
            mass[i].doWork();
            mass[i].stopWork();
        }
    }
}
