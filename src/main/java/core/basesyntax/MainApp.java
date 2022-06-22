package core.basesyntax;

public class MainApp {
    private Truck truck;

    private Bulldozer bulldozer;

    private Excavator excavator;

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public Bulldozer getBulldozer() {
        return bulldozer;
    }

    public void setBulldozer(Bulldozer bulldozer) {
        this.bulldozer = bulldozer;
    }

    public Excavator getExcavator() {
        return excavator;
    }

    public void setExcavator(Excavator excavator) {
        this.excavator = excavator;
    }

    public void main(String[] args) {
        truck.doWork();
        truck.stopWork();

        bulldozer.doWork();
        bulldozer.stopWork();

        excavator.doWork();
        excavator.stopWork();
    }
}

