package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machineArray = new Machine[] {new Truck(), new Excavator(), new Bulldozer()};
        for (Machine machine :
                machineArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
