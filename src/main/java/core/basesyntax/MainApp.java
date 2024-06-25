package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine[] ar = {excavator, truck, bulldozer};

        for (Machine machines : ar) {
            machines.doWork();
            machines.stopWork();
        }
    }
}
