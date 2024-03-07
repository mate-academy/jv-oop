package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();
        machines[0].doWork();
        machines[0].stopWork();
        machines[1].doWork();
        machines[1].stopWork();
        machines[2].doWork();
        machines[2].stopWork();
    }
}