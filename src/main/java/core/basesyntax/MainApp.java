package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();

        Machine[] array = new Machine[]{bulldozer,excavator,truck};

        for (int i = 0; i < array.length; i++) {
            array[i].doWork();
            array[i].stopWork();
        }
    }
}
