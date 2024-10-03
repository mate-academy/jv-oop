package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck;
        truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] carPark = {truck, bulldozer, excavator };
        for (int i = 0; i < carPark.length; i++) {
            carPark[i].doWork();
            carPark[i].stopWork();
        }
    }
}

