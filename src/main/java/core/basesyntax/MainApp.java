package core.basesyntax;

public class MainApp {
    public static void main(String[] arg) {
        Machine[] machines = {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };
        for (Machine m : machines) {
            m.doWork();
            m.stopWork();
        }
    }
}


