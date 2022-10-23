package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine[] array = new Machine[]{excavator, bulldozer, truck};
        for (int i = 0; i < array.length; i++) {
            array[i].doWork();
            array[i].stopWork();

        }
    }
}
