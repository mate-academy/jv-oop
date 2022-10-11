package core.basesyntax;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();

        Machine[] all = new Machine[]{excavator,bulldozer,truck};
        for (Machine a : all) {
            a.doWork();
            a.stopWork();
        }
    }
}
