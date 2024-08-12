package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck;
        truck = new Truck();

        Machine bulldozer = new Bulldozer();

        Machine excavator = new Excavator();
        //tablica z obiektami

        Machine[] carPark = {truck, bulldozer, excavator };

        // stworzyc petle for ktora wyswietli do i stop work

        for (int i = 0; i < carPark.length; i++) {
            carPark[i].doWork();
            carPark[i].stopWork();
        }
    }
}

