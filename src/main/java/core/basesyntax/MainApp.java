package core.basesyntax;

public class MainApp {
    //In Main class create Machine array with Truck, Bulldozer and Excavator and call methods doWork() and stopWork() in a loop.
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }


}
