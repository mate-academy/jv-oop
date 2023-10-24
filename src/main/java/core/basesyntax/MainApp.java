package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] technique = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine vehicle: technique) {
            vehicle.doWork();
            vehicle.stopWork();
        }
    }
}
