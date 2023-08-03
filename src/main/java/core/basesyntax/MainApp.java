package core.basesyntax;

import java.util.Arrays;

public class MainApp {
    private static Machine[] machine = {new Truck(), new Bulldozer(), new Excavator()};

    public static void main(String[] args) {

        for (Machine i : machine) {
            i.doWork();
        }
        for (Machine i : machine) {
            i.stopWork();
        }
    }

}
