package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] array = new Machine[3];
        array[0] = new Bulldozer();
        array[1] = new Truck();
        array[2] = new Excavator();
    }

}
