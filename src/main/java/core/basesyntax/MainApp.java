package core.basesyntax;

public class MainApp {
    Machine truck = new Truck();
    Machine bulldozer = new Bulldozer();
    Machine excavator = new Excavator();

    Machine[] vehicles  = {truck, bulldozer, excavator};
    for (Machine example : vehicles) {
        example.doWork();
        example.stopWork();
    }
}
