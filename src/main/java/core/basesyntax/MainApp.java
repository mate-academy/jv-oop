package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[]{new Excavator(), new Truck(), new Bulldozer()}; //create Machine array with Truck, Bulldozer and Excavator
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
        }
        for (int i = 0; i < machines.length; i++) {
            machines[i].stopWork();
        }
    }
}
