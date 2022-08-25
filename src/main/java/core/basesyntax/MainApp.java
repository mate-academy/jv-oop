package core.basesyntax;

public class MainApp {
    public static void main(final String[] args) {

        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] machines = new Machine[]{truck,bulldozer,excavator};

        for (final Machine m : machines) {
            m.doWork();
            m.stopWork();
        }
    }

}
