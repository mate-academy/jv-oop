package core.basesyntax;

public class MainApp {

    public static void main(String[] names) {
        Machine[] machines = {
                new Truck("Trucky"),
                new Bulldozer("Bulldy"),
                new Excavator("Excavy")
        };
        for (Machine m : machines) {
            m.doWork();
            m.stopWork();
        }
    }
}
