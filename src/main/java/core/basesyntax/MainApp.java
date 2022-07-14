package core.basesyntax;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();

        Machine[] does = {truck, excavator, bulldozer};
        for (int i = 0; i < 3; i++) {
            does[i].doWork();
            does[i].stopWork();
        }
        System.out.println(Arrays.toString(does));
    }
}
