package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine buildozer = new Bulldozer();
        Machine[] array = new Machine[]{truck, excavator, buildozer};

        for (Machine x : array) {
            x.doWork();
            x.stopWork();
        }
    }
}
