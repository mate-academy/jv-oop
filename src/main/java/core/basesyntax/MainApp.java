package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();

        Machine[] transportList = new Machine[]{excavator, truck, bulldozer};
        for (Machine vehicle : transportList) {
            vehicle.doWork();
        }
        for (Machine vehicle : transportList) {
            vehicle.stopWork();
        }
    }
}
