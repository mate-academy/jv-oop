package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machinePark = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : machinePark) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
