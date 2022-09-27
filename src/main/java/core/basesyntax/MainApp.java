package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck1 = new Truck();
        Machine bulldozer1 = new Bulldozer();
        Machine excavator1 = new Excavator();

        Machine[] machines = {truck1, bulldozer1, excavator1};
        for (Machine m : machines) {
            m.doWork();
            m.stopWork();
        }
    }
}
