package core.basesyntax;

public class MainApp {
    private static final Machine[] machine = new Machine[]{new Excavator(), new Bulldozer(), new Truck()};

    public static void main(String[] args) {
        for (Machine vehicle : machine) {
            vehicle.doWork();
            vehicle.stopWork();
        }
    }
}
