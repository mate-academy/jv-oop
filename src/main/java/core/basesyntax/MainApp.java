package core.basesyntax;

public class MainApp {
    Truck truck = new Truck();
    Bulldozer bulldozer = new Bulldozer();
    Excavator excavator = new Excavator();

    Machine[] machines = new Machine[] {truck, bulldozer, excavator};

    public void main(Machine[] machines) {
        truck.doWork();
        truck.stopWork();

        bulldozer.doWork();
        bulldozer.stopWork();

        excavator.doWork();
        excavator.stopWork();
    }
}

