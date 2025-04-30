package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] array = new Machine[3];
        array[0] = new Truck();
        array[1] = new Excavator();
        array[2] = new Bulldozer();
        for (Machine i : array) {
            i.doWork();
            i.stopWork();
        }
    }
}
