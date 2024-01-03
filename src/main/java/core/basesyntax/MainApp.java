package core.basesyntax;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        ArrayList<Machine> arrayList = new ArrayList<Machine>();
        arrayList.add(truck);
        arrayList.add(bulldozer);
        arrayList.add(excavator);
        for (Machine machine : arrayList) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
