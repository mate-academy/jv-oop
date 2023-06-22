package core.basesyntax;

public class MainApp {
    Machine machine[] = {new Truck(), new Bulldozer(), new Excavator()};

    public MainApp() {
        for (Machine i : machine) {
            i.doWork();
        }
        for (Machine i : machine) {
            i.stopWork();
        }
    }

}
