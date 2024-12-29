package core.basesyntax;

public class MainApp {
    Truck truck = new Truck();
    Bulldozer bulldozer = new Bulldozer();
    Excavator excavator = new Excavator();
    Machine[] machines = new Machine[]{truck, bulldozer, excavator};

    public void getMachines() {
        for (Machine values : machines){
            values.doWork();
            values.stopWork();
        }
    }
}
