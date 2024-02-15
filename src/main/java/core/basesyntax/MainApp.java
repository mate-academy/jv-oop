package core.basesyntax;

public class MainApp {
    private static void mail(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] vehicles = {truck, bulldozer, excavator};
        for (Machine vehic : vehicles) {
            vehic.doWork();
            vehic.stopWork();
        }
    }
}
