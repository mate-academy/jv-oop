package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] array = {truck, bulldozer, excavator};
        for (Machine element : array) {
            element.doWork();
            element.stopWork();
        }
    }
}
