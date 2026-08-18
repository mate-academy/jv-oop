package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] cars = {truck, bulldozer, excavator};
        for (int i = 0; i < cars.length; i++) {
            cars[i].doWork();
            cars[i].stopWork();

        }
    }
}
