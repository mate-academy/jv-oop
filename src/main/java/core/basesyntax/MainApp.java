package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck t1 = new Truck();
        Bulldozer b1 = new Bulldozer();
        Excavator e1 = new Excavator();

        Machine[] machines = {t1, b1, e1};
        for (Machine m : machines) {
            m.doWork();
            m.stopWork();
        }
    }

}
