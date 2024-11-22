package core.basesyntax;

public class MainApp {

    public static void mail (String[] args) {
        Machine [] machines = new Machine[] {
                new Truck(), new Bulldozer(), new Excavator()
        };
        for (int i = 0; i <= machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
