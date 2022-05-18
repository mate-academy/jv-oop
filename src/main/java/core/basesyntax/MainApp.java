package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("8 o'clock. Lets do something!");
        Machine[] machines = new Machine[]{new Bulldozer(), new Truck(), new Excavator()};
        for (Machine vehicle: machines) {
            vehicle.doWork();
        }
        System.out.println("\nWe build one floor today. \nLets go home.\n");
        for (Machine vehicle: machines) {
            vehicle.stopWork();
        }
    }
}
