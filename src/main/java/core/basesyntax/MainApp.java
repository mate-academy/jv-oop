package core.basesyntax;

import java.util.Arrays;

public class MainApp {
    private Machine[] machine = {new Truck(), new Bulldozer(), new Excavator()};

    public MainApp() {

        for (Machine i : machine) {
            i.doWork();
        }
        for (Machine i : machine) {
            i.stopWork();
        }
    }

}
