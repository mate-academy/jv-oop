package core.basesyntax;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        //List<Machine> machines = Arrays.asList(truck, bulldozer, excavator);
        //machines.stream().forEach(a-> a.doWork());
      //  machines.stream().forEach(a-> a.stopWork());
    }
}
