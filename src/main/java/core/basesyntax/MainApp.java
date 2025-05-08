package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] allMachine = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine: allMachine) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
