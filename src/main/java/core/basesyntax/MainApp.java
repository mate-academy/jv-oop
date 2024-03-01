package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine[] arrays = new Machine[3];
        arrays[0] = new Excavator();
        arrays[1] = new Bulldozer();
        arrays[2] = new Truck();

        for (Machine machines : arrays) {
            machines.doWork();
            machines.stopWork();
        }

    }
}
