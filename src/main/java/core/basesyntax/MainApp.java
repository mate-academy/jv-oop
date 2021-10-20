package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = new Machine[3];
        machine[0] = new Bulldozer();
        machine[1] = new Excavator();
        machine[2] = new Truck();
        for (Machine machineX : machine) {
            machineX.doWork();
        }
        for (Machine machineX : machine) {
            machineX.stopWork();
        }
    }
}
