package core.basesyntax;

public class MainApp {
    Machine truck = new Truck();
    Machine bulldozer = new Bulldozer();
    Machine excavator = new Excavator();
    Machine[] machines = new Machine[]{truck, bulldozer, excavator};
       for (Machine i : machines) {
        i.doWork();
        i.stopWork();
    }


}
