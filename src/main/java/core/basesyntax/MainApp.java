package core.basesyntax;

public class MainApp {

    private Excavator excavator = new Excavator();
    private Truck truck = new Truck();
    private Bulldozer bulldozer = new Bulldozer();
    private Machine[] machines = {excavator, truck, bulldozer};

    public void main() {
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}

