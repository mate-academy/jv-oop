package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(),new Excavator()};
        for (Machine vehicle: machines) {
            vehicle.doWork();
            vehicle.stopWork();
        }

    }

}
