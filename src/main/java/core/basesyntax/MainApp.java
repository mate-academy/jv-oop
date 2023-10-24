package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        //create Machine array with Truck, Bulldozer and Excavator
        Machine[] machines = new Machine[]{new Excavator(), new Truck(), new Bulldozer()};
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
        }
        for (int i = 0; i < machines.length; i++) {
            machines[i].stopWork();
        }
    }
}
