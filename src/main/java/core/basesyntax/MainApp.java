package core.basesyntax;

public class MainApp {
    Machine truck = new Truck();
    Machine bulldozer = new Bulldozer();
    Machine excavator = new Excavator();

    Machine[] veh  = {truck, bulldozer, excavator};
    for (Machine machin : veh) {
        machin.doWork();
        machin.stopWork();
    }
}
