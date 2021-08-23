package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        // Create an object of each class
        Machine[] machines = new Machine[3];
        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();
        // Start and end work of all machines
        for (Machine item : machines) {
            item.doWork();
            item.stopWork();
        }
    }
}
