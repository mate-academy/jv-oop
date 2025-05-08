package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Machine[] array = {truck, bulldozer, excavator};
        for (int i = 0; i < array.length; i++) {
            array[i].doWork();
            array[i].stopWork();
        }
    }
}
