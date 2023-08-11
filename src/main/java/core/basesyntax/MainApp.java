package core.basesyntax;

public class MainApp {

    public void main(String[] args) {
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
    private Machine Truck;
    private Machine Bulldozer;
    private Machine Excavator;
    Machine[] machines = new Machine[]{Truck, Bulldozer, Excavator};


}
